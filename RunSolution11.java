import java.sql.SQLOutput;

/**
 * 달리기반 문제 11번 콜라츠 추측
 */
class RunSolution11 {
    public int runSolution11(long num) {
        int answer = 0;

        while(num!=1) {
            if(num%2==0) {
                num /= 2;
            } else {
                num = 3*num + 1;
            }
            answer++;
            if(answer==500) {
                answer=-1; break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RunSolution11 runSolution11 = new RunSolution11();
        long num = 6;
        System.out.println(runSolution11.runSolution11(num));
    }
}