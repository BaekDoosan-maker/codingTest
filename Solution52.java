/**
 * 문제 52번 카카오 인턴, 키패드 누르기
 */
class Solution52{
    StringBuilder sb = new StringBuilder();
    int prevL = 10, prevR = 12;

    public String solution52(int[] numbers, String hand) {
        char handDefault = hand.equals("right") ? 'R' : 'L';
        for (int n : numbers) {
            if (n == 0 || n % 3 == 2) {
                if (n == 0) n = 11;
                int diff = getDiff(prevL, n) - getDiff(prevR, n);

                push(n, diff < 0 ? 'L' : (diff > 0 ? 'R' : handDefault));
            } else push(n, n % 3 == 1 ? 'L' : 'R');
        }
        return sb.toString();
    }

    void push(int n, char hand) {
        sb.append(hand);

        if (hand == 'L') prevL = n;
        else prevR = n;
    }

    int getDiff(int prev, int num) {
        return Math.abs(prev - num) / 3 + Math.abs(prev - num) % 3;
    }

    public static void main(String[] args) {
        Solution52 solution52 = new Solution52();
        int numbers [] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String stringhand = "right";
        System.out.println(solution52.solution52(numbers,stringhand));
    }
}