/**
 * 콜라츠 추측
 */
class Solution27 {
    public int solution27(long num) {
        int answer = 0;

        while(num!=1) {
            if(num%2==0) {
                num /= 2;
            } else {
                num = 3*num + 1;
            }

            answer++;
            if(answer==500) {
                answer=-1; break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        long num = 123;
        System.out.println(solution27.solution27(num));
    }
}