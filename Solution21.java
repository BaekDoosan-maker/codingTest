import java.util.Locale;
import java.util.Scanner;

/**
 * 문제 21번 이상한 문자 만들기
 *
 */
class Solution21 {
    public String solution21(String s) {
        String answer = "";
        int idx = 0;
        String[] strArr = s.split("");
        for(int i=0; i<strArr.length; i++) {
            if((" ").equals(strArr[i])) idx = 0;
            else {
                if(idx%2==0) {
                    idx++;
                    strArr[i] = strArr[i].toUpperCase();
                }else {
                    idx++;
                    strArr[i] = strArr[i].toLowerCase();
                }
            }
            answer += strArr[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution21 solution21 = new Solution21();
        //String[] s = {"try hello world"};
        System.out.println(solution21.solution21(String.valueOf(s)));
    }
}