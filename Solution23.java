import java.util.Arrays;

/**
 * 문제 : 23 자연수 뒤집기
 */
class Solution23 {
    public int[] solution(long n) {
        int len = (""+n).length();
        int[] arr = new int[len];

        for(int i=0; i<len; i++) {
            arr[i] = (int)(n%10);
            n/=10;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int n = 12345;
        System.out.println(Arrays.toString(solution23.solution(n)));
    }
}
