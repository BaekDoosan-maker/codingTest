import java.util.Arrays;

/**
 * 달리기반 문제 7번 자연수 뒤집어 배열로 만들기
 */

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 *
 * 입출력 예시
 * n	return
 * 12345	[5,4,3,2,1]
 */

class RunSolution07 {
    public int[] runsolution07(long n) {
        int len = (""+n).length();
        int[] arr = new int[len];

        for(int i=0; i<len; i++) {
            arr[i] = (int)(n%10);
            n/=10;
        }
        return arr;
    }

    public static void main(String[] args) {
        RunSolution07 runsolution07 = new RunSolution07();
        long n = 123;
        System.out.println(Arrays.toString(runsolution07.runsolution07(n)));
    }
}