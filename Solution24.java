/**
 * 문제 : 24 정수 내림차순으로 정렬하기
 */
import java.util.*;
public class Solution24 {
    public long solution24(long n){
        String str = Long.toString(n);
        List<Character> list = new ArrayList<Character>();

         for(int i =0; i< str. length(); i++){
             list.add(str.charAt(i));
         }
         list.sort(Comparator.reverseOrder());
         String temStr = "";
         for(int i= 0 ; i < list.size(); i++) {
             temStr += list.get(i);
         }
         return Long.parseLong(temStr);
    }

    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        long n = 1234;
        System.out.println(solution24.solution24(n));
    }

}
