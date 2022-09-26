class Solution13 {
    public String solution13(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;
        for (int i = 0; i < a - 1; i++) {
            date += month[i];
        }

        date += b - 1;

        return day[date % 7];
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.solution13(5,24));
    }
}