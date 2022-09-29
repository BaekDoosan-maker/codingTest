/**
 * 문제 18번: 서울에서 김서방 찾기
 */
class Solution18 {
    public String solution18(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        String[] seoul  = {"Jane","Kim"};
        System.out.println(solution18.solution18(seoul));
    }
}