/**
 * 달리기반 문제 21번 소수만들기
 * 걷기 반 문제 37번과 동일한 문제
 */
class RunSolution21 {
    public int runSolution21(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }
        return answer;
    }
    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 나눠 떨어질 경우
            if (num % i == 0) {

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        RunSolution21 runSolution21 = new RunSolution21();
        int []nums = { 1,2,3,4};
        System.out.println(runSolution21.runSolution21(nums));
    }
}