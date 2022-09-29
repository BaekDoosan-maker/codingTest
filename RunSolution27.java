/**
 * 달리기반 문제 : 27번 예산
 * 걷기반 문제 : 43번 예산문제와 동일함
 */
import java.text.RuleBasedCollator;
import java.util.*;
class RunSolution27 {
    public int runSolution27(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        RunSolution27 runSolution27 = new RunSolution27();
        int []d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(runSolution27.runSolution27(d, budget));
    }
}
