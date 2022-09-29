import java.util.Scanner;
/**
 * 달리기반 문제 26번 약수의 합
 * 걷기 반 문제 문제 42번과 동일
 */
public class RunSolution26 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++){
            if((num % i) == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(num + "의 약수의 합 = " + sum);
    }
}
/*
Solution.java
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; i++) {
            if(n%i == 0 )
                answer += i;
            }


         return answer;
    }
}
 */