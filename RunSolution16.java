import java.util.ArrayList;
import java.util.Collections;

/**
 * 달리기반 문제 16번 두개 봅아서 더하기
 */
class RunSolution16 {
    public ArrayList<Integer> RunSolution16(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean[] check = new boolean[201];
        for(int i =0;i<numbers.length-1;i++){
            int sum;
            for(int j = i+1;j<numbers.length;j++){
                sum = numbers[i]+numbers[j];
                if(!check[sum]){
                    answer.add(sum);
                    check[sum] = true;
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        RunSolution16 runSolution16 = new RunSolution16();
        int [] numbers = {2,1,3,4,1};
        System.out.println(runSolution16.RunSolution16(numbers));
    }
}
