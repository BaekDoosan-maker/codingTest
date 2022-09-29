public class Solution10 {
    public int[][] Solution10(int[][] arr1, int[][] arr2){
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 c = new Solution10();
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        int[][] answer = c.Solution10(arr1,arr2);
        if(answer[0][0]== 4 && answer[0][1] == 6 &&
                answer[1][0]== 7 && answer[1][1] ==9) {
            System.out.println("굿잡 제출 ㄱㄱ");
        }else{
            System.out.println("다시해봐 수정해");
        }
    }
}