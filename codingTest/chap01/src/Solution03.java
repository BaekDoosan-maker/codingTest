/**
 *문제3번 가운데 글자 가져오기
 *
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 제한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	return
 * "abcde"	"c"
 * "qwer"	"we"
 */
public class Solution03 {
    String solution3(String s) {
        String answer = "";
        int a = s.length() / 2;
        // 단어 길이의 절반인 위치를 구해 변수 a 로 선언한다.
        if (s.length() % 2 == 0) {
            /**
             인자로 주어진 string의 길이를 구하여
             단어의 길이가 짝수면
             */

            answer += s.substring(a - 1, a + 1);
            /**
             sugstring(시작,끝)
             짝수일때 중간은 짝수를 나눴을때 몫의 값이다.
             하지만 인덱스 값은 0부터 시작하므로
             몫값에서 -1을 한것이 시작이 위치다.
             */
        } else {
            // 홀수면
            answer += s.substring(a, a + 1);
            /**
              홀수일때 중간은 홀수를 나눴을때
              몫의 값이 인덱스값의 중간이므로
              그대로 시작위치가 된다.*/
        }
        return answer;
    }
    public static void main(String[] args) {
        // 테스트로 출력해보기 위한 코드
        Solution03 se = new Solution03();
        System.out.println(se.solution3("doosan"));
    }
    // doosan의 가운데 글자인 os가 출력된다.
}
