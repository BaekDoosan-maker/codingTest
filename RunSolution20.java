import java.util.Arrays;
import java.util.Collections;

/**
 * 달리기반 문제 20번
 * 내림차순으로 배치하기
 * 걷기반 문제 36번과 동일
 */
class RunSolution20 {
    public String RunSolution20(String s) {
        // 1. 문자열 배열의 인덱스별로 각 문자를 저장.
        String answer[] = s.split("");
        // 2. 출력을 위한 변수
        String str="";
        // 3. Arrays.sort()메소드의 Collections.reverseOrder()메소드를 사용해 역순정렬.
        Arrays.sort(answer, Collections.reverseOrder());
        // 4. 출력 데이터 생성.
        for(int i=0;i<answer.length;i++){
            str+=answer[i];
        }
        return str;
    }

    public static void main(String[] args) {
        RunSolution20 RunSolution20 = new RunSolution20();
        String s = Arrays.toString(new String[]{"Zbcdefg"});
        System.out.println(RunSolution20.RunSolution20(s));
    }
}
