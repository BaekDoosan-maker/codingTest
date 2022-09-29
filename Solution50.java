/**
문제 50번 포켓몬
*/
import java.util.HashSet;
class Solution50 {
    public int solution50(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : nums) {
            set.add(i);
        }
        int answer = nums.length / 2;

        if (answer > set.size()) {
            answer = set.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        int [] nums = {3,3,3,2,2,4};
        System.out.println(solution50.solution50(nums));
    }
}