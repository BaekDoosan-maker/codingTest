class Solution19 {
    public String solution19(int n) {
        String answer = "";

        for(int i  = 0; i < n; i++){
          if(i%2 ==1){
              answer += "박";
          }else
              answer += "수";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int n =3;
        System.out.println(solution19.solution19(n));
    }
}