/**
 * 문제 9번 핸드폰 번호 가리기
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 * 입출력 예
 * phone_number	return
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 */

class Solution09 {
    public static  String phone_number = "01033334444";

    public String solution09() {
        //입력받은 phone_number의 값의 길이중 뒤에 4자리만 *로 표시하면 된다.
        String answer = "";
        String[] num = phone_number.split("");
        int len = num.length;
        for(int i = 0; i < len; i++) {
            // for문을 이용해 phone_number의 길이만큼 반복한다.
            if (i < len - 4) {
                // if문을 이용하여 i가 phone_number의 길이에서 -4를 뺀 수보다 작을때까지
                answer += "*";
                // answer 변수에 *을 넣어준다.
            } else {
                answer += num[i];
                // 위 조건이 아니라면 반복분을 통해 문자를 하나씩 순서대로 넣어준다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution09 sl = new Solution09();
        String v = sl.solution09();
        System.out.println(v);
    }
}
