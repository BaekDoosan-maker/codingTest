/**
 * 제일 작은 수 제거하기
 */
class Solution26 {
    public int[] solution26(int[] arr) {
        if(arr.length == 1) return new int[] {-1};

        int min = Integer.MAX_VALUE;
        for(int a : arr) {
            if(min > a) min = a;
        }

        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int a : arr) {
            if(min != a) newArr[index++] = a;
        }

        return newArr;
    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int []arr = {1,2,3};
        System.out.println(solution26.solution26(arr));
    }
}
