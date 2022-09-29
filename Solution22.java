import java.util.*;
/**
 *  문제 : 22 자릿수 더하기
 *
 */
public class Solution22 {
    public int solution22(int n) {
        int answer = 0;
        int a = 0;

        while(true) {
            a = n%10;
            n = n/10;
            answer += a;

            if(n==0) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        int n = 123;
        System.out.println(solution22.solution22(n));
    }
}