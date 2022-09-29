import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 달리기반 문제 18번 : 모의고사
 * 스트림으로 연습해보기
 */
public class Stream {
    public int[] stream(int[] answers) {
        return new Students().getBestStudents(
                        Arrays.stream(answers)
                                .boxed()
                                .map(Answer::new)
                                .collect(Collectors.toList()))
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private static class Students {
        private final List<Student> students;

        public Students() {
            this.students = new ArrayList<>();
            this.students.add(Student.of(1, Arrays.asList(1, 2, 3, 4, 5)));
            this.students.add(Student.of(2, Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5)));
            this.students.add(Student.of(3, Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)));
        }

        public List<Integer> getBestStudents(List<Answer> answers) {
            return this.students.stream()
                    .map(student -> student.getResult(answers))
                    .collect(Collectors.collectingAndThen(Collectors.toList(), Results::new))
                    .getBestResults().stream()
                    .map(Result::getStudentId)
                    .collect(Collectors.toList());
        }
    }

    private static class Student {
        private final Integer id;
        private final List<Answer> answerPattern;

        public Student(Integer id, List<Answer> answerPattern) {
            this.id = id;
            this.answerPattern = answerPattern;
        }

        public static Student of(Integer id, List<Integer> answerPattern) {
            return new Student(id, answerPattern.stream()
                    .map(Answer::new)
                    .collect(Collectors.toList()));
        }

        public Result getResult(List<Answer> answers) {
            Long correctCount = IntStream.range(0, answers.size())
                    .filter(isCorrect(answers))
                    .count();

            return new Result(this.id, correctCount.intValue());
        }

        private IntPredicate isCorrect(List<Answer> answers) {
            return index -> {
                int patternIndex = index % answerPattern.size();
                Answer answer = answerPattern.get(patternIndex);
                Answer correctAnswer = answers.get(index);

                return answer.isCorrect(correctAnswer);
            };
        }
    }

    private static class Results {
        private final List<Result> results;

        public Results(List<Result> results) {
            this.results = results;
        }

        public List<Result> getBestResults() {
            Result bestResult = Collections.max(results);

            return results.stream()
                    .filter(result -> result.isCorrectCountEqualTo(bestResult))
                    .collect(Collectors.toList());
        }
    }

    private static class Result implements Comparable<Result> {
        private final Integer studentId;
        private final Integer correctCount;

        public Result(Integer studentId, Integer correctCount) {
            this.studentId = studentId;
            this.correctCount = correctCount;
        }

        public boolean isCorrectCountEqualTo(Result result) {
            return this.correctCount.equals(result.correctCount);
        }

        public Integer getStudentId() {
            return studentId;
        }

        @Override
        public int compareTo(Result o) {
            return this.correctCount.compareTo(o.correctCount);
        }

    }

    private static class Answer {
        private final Integer answer;

        public Answer(Integer answer) {
            this.answer = answer;
        }

        public boolean isCorrect(Answer answer) {
            return this.answer.equals(answer.answer);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Answer answer1 = (Answer) o;
            return Objects.equals(answer, answer1.answer);
        }

        @Override
        public int hashCode() {
            return Objects.hash(answer);
        }
    }

    public static void main(String[] args) {
        Stream stream = new Stream();
        int[] answers = {1,2,3,4};
        System.out.println(Arrays.toString(stream.stream(answers)));
    }
}