import java.lang.*;

/**
 *  달리기반 문제 9번 정수 제곱근 판별
 */

/**
 *
 */
class RunSolution09 {
    public long runSolution09(long n) {
        long answer = 0;
        double temp = Math.sqrt(n);

        if(temp - (int)temp > 0)
            answer = -1;
        else
            answer = (long)Math.pow(temp+1,2);

        return answer;
    }

    public static void main(String[] args) {
        RunSolution09 runSolution09 = new RunSolution09();
        long n = 121;
        System.out.println(runSolution09.runSolution09(n));
    }
}
