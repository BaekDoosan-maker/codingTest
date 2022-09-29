import java.util.*;
/**
 * 달리기반 19번 문제 : 문자열 내맘대로 정렬하기
 */

class RunSolution19 {
    public String[] RunSolution19(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).substring(n, n+1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RunSolution19 runSolution19 = new RunSolution19();
        String[] strings = {"sun", "bed", "car"};
                int n = 1;
        System.out.println(Arrays.toString(runSolution19.RunSolution19(strings, n)));
    }
}
