import java.util.*;
/**
 * 달리기반 문제 8번 정수 내림차순으로 배치하기
 */

/**
 *문제설명
 *
 *정수 내림차순으로 배치하기
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 *
 * 입출력 예시
 * n	return
 * 118372	873211
 */
class RunSolution08 {
    public long runsolution08(long n) {
        String str = Long.toString(n);
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        list.sort(Comparator.reverseOrder());
        String temStr = "";
        for (int i = 0; i < list.size(); i++) {
            temStr += list.get(i);
        }
        return Long.parseLong(temStr);
    }

    public static void main(String[] args) {
        RunSolution08 runsolution08 = new RunSolution08();
        long n = 123;
        System.out.println(runsolution08.runsolution08(n));
    }
}