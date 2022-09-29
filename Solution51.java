import java.util.Arrays;

/**
 * 달리기반 문제 35번 비밀지도
 * 걷기반 문제 51번과 동일
 */
class Solution51 {
    public String[] solution51(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i =0;i<n;i++){
            // 1. arr1과 arr2의 원소들을 이진수로 바꾼 뒤, or 비트 논리연산 수행.
            String str=Integer.toBinaryString(arr1[i] | arr2[i]);
            // 2. 5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            str = String.format("%"+n+"s",str);
            // 3. 1->#, 0 -> 공백 으로 바꾼다.
            str = str.replaceAll("1" , "#");
            str = str.replaceAll("0" , " ");
            // 4. 한 줄 완성.
            answer[i] = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();
        int n = 5;
        int [] arr1 = {9, 20, 28, 18, 11};
        int [] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution51.solution51(n, arr1, arr2)));
    }
}