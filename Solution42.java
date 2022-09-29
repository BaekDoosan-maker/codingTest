import java.util.Scanner;
/**
 * 문제 42 번 약수의 합
 *
 */
public class Solution42 {
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