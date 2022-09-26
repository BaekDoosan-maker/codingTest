/**
 * 문제 16번 : 문자열 내 p와 y의 개수
 */
class Solution16 {
    boolean solution16(String s) {
        boolean answer = true;

        String[] pyArrayList = s.toUpperCase().split("");
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < pyArrayList.length; i++) {
            if (pyArrayList[i].equals("P")) {
                countP++;
            } else if (pyArrayList[i].equals("Y")) {
                countY++;
            }
        }
        if (countP != countY) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        String s = "pPoooyY";
        //String s = "Pyy";
        System.out.println(solution16.solution16(s));
    }
}