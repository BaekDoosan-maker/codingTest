/**
 * 문제 2번 짝수와 홀수
 *
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 * 입출력 예
 * num	return
 * 3	"Odd"
 * 4	"Even"
 */

public class Solution02 {
    String solution02(int num) {
        String answer = "";
        if (num % 2 == 0) answer = "Even";
        else answer="Odd";
        return answer;
    }

    public static void main(String[] args) {
      //  String str = "1 2 3 4";
        Solution02 evenOrOdd = new Solution02();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.solution02(3));
        System.out.println("결과 : " + evenOrOdd.solution02(3));
    }
}


