import java.security.cert.CertPathValidatorException;
/**
 *  문제39 번 시저 암호
 */
class Solution39 {
    public String solution39(String s, int n) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                if(Character.isUpperCase(arr[i])){
                    arr[i] += n;
                    if(arr[i] > 'Z') {
                        arr[i] = (char)('A' + (arr[i] - 'Z' -1));
                    }
                } else {
                    arr[i] += n;
                    if(arr[i] > 'z'){
                        arr[i] = (char)('a' + (arr[i] - 'z' - 1));
                    }
                }
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        String s =  "AB";
        int n = 1;
        System.out.println(solution39.solution39(s,n));
    }
}