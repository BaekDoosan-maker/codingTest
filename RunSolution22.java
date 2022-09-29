import java.util.HashMap;

/**
 * 달리기반 22번 문제 숫자 문자열과 영단어
 * 걷기반 38번 문제와 동일
 */

class RunSolution22 {
    public int runSolution22(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Character> hm = new HashMap<>() {{
            put("zero", '0');
            put("one", '1');
            put("two", '2');
            put("three", '3');
            put("four", '4');
            put("five", '5');
            put("six", '6');
            put("seven", '7');
            put("eight", '8');
            put("nine", '9');
        }};

        while (index < s.length()) {
            // 1. 숫자 or 글자 체크
            if (hm.containsValue(s.charAt(index))) {
                sb.append(s.charAt(index));
                index += 1;
                continue;
            }

            for (int len = 3; len < 6; len++) {
                if (hm.containsKey(s.substring(index, index + len))) {
                    sb.append(hm.get(s.substring(index, index + len)));
                    index += len;   // next index
                    break;
                }
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        RunSolution22 runSolution22 = new RunSolution22();
        String s = "23four5six7";
        System.out.println(runSolution22.runSolution22(s));
    }
}
