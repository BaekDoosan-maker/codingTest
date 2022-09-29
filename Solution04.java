/**
 *  문제 1번 직사각형 별 찍기
 */
import java.util.Scanner;
class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        for (int i = 0; i <a; i++) { // 1번
            for (int j = 0; j < b; j++) { // 2번
                System.out.print("*"); //3번
            }
            System.out.println();  // 4번
        }
    }
}


