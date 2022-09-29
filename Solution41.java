/**
 *  문제 41 번 약수의 개수와 덧셈
 */
public class Solution41 {
     public int solution41 (int left, int right ){
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
        Solution41 solution41 = new Solution41();
        int left = 13;
        int right = 17;
        System.out.println(solution41.solution41(left, right));
    }
}