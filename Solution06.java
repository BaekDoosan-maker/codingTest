import java.util.ArrayList;

/**
 * 문제6 없는 숫자 더하기
 *
 * 문제 설명
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를
 * return 하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 * 입출력 예
 * numbers	result
 * [1,2,3,4,6,7,8,0]	14
 * [5,8,4,0,6,7,9]	6
 *
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
 * 입출력 예 #2
 *
 * 1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 */

class Solution06 {
    public static int[] numbers = {5,8,4,0,6,7,9};
    public int solution06(int[] numbers) {
        int sum = 45;
        for(int i=0; i<numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution06 sl = new Solution06();
        int v = sl.solution06(numbers);
        System.out.println(v);
    }
}

/*
public class Solution066 {
    public int solution(int[] numbers){
        int sum = 0;
        int [] oneToNine = {1,2,3,4,5,6,7,8,9,0};
        ArrayList<Integer> zeroToNineArr = new ArrayList<>();
        for(int number: oneToNine) {
            zeroToNineArr.add(number);
        }
        for(int number: number){
            if(zeroToNineArr.contains(number)){
                zeroToNineArr.remove(number);
            }
        }
        for(Integer integer : zeroToNineArr){
            sum += integer;
        }
        return  sum;
    }
    public static void main(String[] args) {
    }
}
 */