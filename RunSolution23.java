/**
 * 달리기반 문제 23번 시저암호
 * 걷기 반 문제 39번 문제와 동일
 */
class RunSolution23 {

    public String runSolution23(String s, int n) {
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
        RunSolution23 runSolution23 = new RunSolution23();
        String s = "AB";
        int n = 1;
        System.out.println(runSolution23.runSolution23(s,n));
    }
}