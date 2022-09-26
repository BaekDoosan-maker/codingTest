
import java.util.*;

class Solution11 {

    public long[] solution11(long x, int n) {
        long[] answer = new long[n];
        for(int i =0; i<n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution11 T = new Solution11();
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int n = kb.nextInt();
        System.out.println(T.solution11(x,n));



    }
}