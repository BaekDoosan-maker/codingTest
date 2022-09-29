import java.lang.*;

/**
 * 정수 제곱근 판별
 */
class Solution25 {
    public long solution(long n) {
        long answer = 0;
        double temp = Math.sqrt(n);

        if(temp - (int)temp > 0)
            answer = -1;
        else
            answer = (long)Math.pow(temp+1,2);

        return answer;
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        long n = 121;
        System.out.println(solution25.solution(n));
    }
}
