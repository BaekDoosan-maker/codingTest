import java.io.IOException;
/**
 * 문제 28번:  하샤드 수
 */
class Solution28 {
    public boolean solution28 (int x) throws IOException {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if (x % sum == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) throws IOException {
        Solution28 solution28 = new Solution28();
        int x  = 10;
        System.out.println(solution28.solution28(x));
    }
}