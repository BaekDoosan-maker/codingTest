import java.util.Arrays;

class Solution14 {
    public int[] solution14(int[] array, int divisor) {

        int count=0,two=0;
        for(int i=0; i< array.length; i++){
            if(array[i]%divisor==0)
                count++;
        }
        int[] ret = new int[count];
        for(int i=0; i< array.length; i++){
            if(array[i]%divisor==0)
                ret[two++]=array[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution14 div = new Solution14();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.solution14(array, 5) ));
    }
}