class Solution17 {
    public boolean solution17(String s) {
        boolean answer = false;

        if(s.length()== 4 || s.length() == 6) {
            try {
                int a = Integer.parseInt(s);
                answer = true;
            } catch (NumberFormatException e) {
                answer = false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        String s = "1234";
        System.out.println(solution17.solution17(s));
    }
}