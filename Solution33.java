import java.util.Arrays;

/**
 *  문제 33번 로또의 최고 순위와 최저 순위
 *  버린다
 */
class Solution33 {
    public static int[] win_nums = {31, 10, 45, 1, 6, 19};
    public static int[] lottos = {44, 1, 0, 0, 31, 25};
    public int[] solution33(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0; // 맞춘 번호
        int zero = 0; // 알아볼 수 없는 번호
        for(int i : lottos){
            if(i == 0){ // 번호를 알아볼 수 없는 경우
                zero++;
            } else {
                for(int j : win_nums){
                    if(i == j){
                        win++;
                        break;
                    }
                }
            }
        }
        answer[0] = (win+zero) > 1 ? 7-(win+zero) : 6;
        answer[1] = win > 1 ? 7-win : 6;
        return answer;
    }
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(Arrays.toString(solution33.solution33(lottos, win_nums)));
    }
}