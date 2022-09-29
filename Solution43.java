import java.util.*;

/**
 * 문제 43번
 * budget 예산
 */
class Solution43 {
    public int solution43(int[] d, int budget) {
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
        Solution43 solution43 = new Solution43();
        int []d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution43.solution43(d,budget) );
    }
}