/**
 * 문제 29번 3진법 뒤집기
 */
public class Solution29 {

    public int solution29(int n) {
        String answer = "";

        while(n >= 3) {
            answer += n % 3;
            n /= 3;
        }
        answer += n;

        return Integer.parseInt(answer, 3);
    }

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int n = 123;
        System.out.println(solution29.solution29(n));
    }
}
