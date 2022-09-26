class Solution15 {
    public static int[]a = {1,2,3,4};
    public static int[]b = {-3,-1,0,4};

    public int solution15(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution15(a,b));
    }
}