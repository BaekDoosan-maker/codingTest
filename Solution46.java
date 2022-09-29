/**
 *  문제 46번 나머지가 1이 되는 수
 */
class Solution46 {
    public int solution46(int n) {
        int answer = 0;
        int idx = 0;
        int[] arr = new int[n];

        for(int i=1; i<n ;i++){
            if(n%i == 1){
                arr[idx] = i;
                idx++;
            }
        }
        answer = arr[0];
        return answer;
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int n = 10;
        System.out.println(solution46.solution46(n));
    }
}