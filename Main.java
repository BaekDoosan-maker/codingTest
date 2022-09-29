import java.util.Arrays;
public class Main {
    public int[] solution(int n){
        //String answer = "" ;
        int num = n;
        int cnt = 0;
        while(num !=0){
            num /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];
        num = n;
        for(int i=0; num !=0; i++){

            answer[i] = (int)(num%10);
            num/=10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(Arrays.toString(method.solution(718253)));
    }
}