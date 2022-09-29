import java.io.IOException;
/**
 * 달리기반 문제 12번 하샤드 수
 */
class RunSolution12 {
    public boolean RunSolution12 (int x) throws IOException {
        int sum = 0;
        int a = x;
        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum == 0) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) throws IOException {
        RunSolution12 runSolution12 = new RunSolution12();
        int x = 10;
        System.out.println(runSolution12.RunSolution12(x));
    }
}