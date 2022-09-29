
/**
 * 문제 8번 평균구하기
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 *입출력 예
 * arr	return
 * [1,2,3,4]	2.5
 * [5,5]	5
 */
class Solution08 {

    public static int[] arr = {1,2,3,4};
    public double solution08(int[] arr) {
        //int형 타입을 받는 arr 배열을 선언하고
        double answer = 0;
        //실수값을 받을수있는 double 타입으로 answer 를 선언하고
        for(int i = 0; i < arr.length; i++) {
            //반복문 for문을 이용해 , arr 배열의 길이만큼 for문으로 돌리고
            answer += arr[i];
            // 그값을 answer에 더해주면서 반복한다.
        }
        answer = answer / arr.length;
        //answer를 arr배열의 길이로 나눠주고
        return answer;
        //그 몫을 answer에 입력한다.
    }

    public static void main(String[] args) {
        Solution08 sl = new Solution08();
        double v = sl.solution08(arr);
        System.out.println(v);
    }
}