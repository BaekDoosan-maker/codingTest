import java.util.Arrays;
/**
 * 달리기반 문제 28번 문제 : 최대공약수와 최소공배수
 * 걷기반 문제 44번 문제 : 최대공약수와 최소 공배수와 동일함
 */
public class RunSolution28 {
    public static int [] runSolution28(int n, int m){
        int max = Math.max(n,m);
        int min = Math.min(n,m);

        while(min !=0){
            int r  = max % min;
            max = min;
            min = r;
        }
        int gcd = n * m/ max;
        int[] answer = {max , gcd};
        return answer;
    }

    public static void main(String[] args) {
        RunSolution28 runSolution28 = new RunSolution28();
        int n = 3;
        int m  = 12;
        System.out.println(Arrays.toString(runSolution28.runSolution28(n, m)));
    }
}
