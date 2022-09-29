/**
 * 문제4번 두 정수 사이의 합
 *
 * 두정수 a,b 가 주어젔을때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수 solution을 완성하세요.
 * 예를 들어, a=3, b=5인 경우, 3+4+5 = 12 이므로 12를 리턴합니다.
 *
 */
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max, min;

        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        for(; min<=max; min++ ){
            answer += min;

        }
        return answer;
    }

    public static void main(String args[]){
        int a = 3, b=5;
        Solution sol = new Solution();
        System.out.println(sol.solution(a,b));
    }
}