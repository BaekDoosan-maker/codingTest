/**
 * 달리기반 25번 문제 약수의 개수와 덧셈
 * 걷기 반 41번 문제와 동일
 */
public class RunSolution25 {
    public int runSolution25 (int left, int right ){
        int answer = 0;
        for(int i=left; i< right+1; i++){
            int count = 0;
            for(int j=1; j <= i/2+1; j++){
                if(i%j == 0){
                    if(j==i/j) count += 1;
                    else count += 2;
                }
            }
            if(count%2 ==0) answer += i;
            else answer -= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        RunSolution25 runSolution25 = new RunSolution25();
        int left = 13;
        int right = 17;
        System.out.println(runSolution25.runSolution25(left, right));
    }
}