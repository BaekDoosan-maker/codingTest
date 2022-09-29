/**
 *  달리기반 문제 24 번 신규 아이디 추천
 *  걷기반 문제 40번 신규 아이디 추천과 동일함
 */
class RunSolution24 {
    public String RunSolution24(String new_id) {

        new_id = new_id.toLowerCase();


        String id = "";
        for(int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                id += String.valueOf(ch);
            } else if(ch >= '0' && ch <= '9') {
                id += String.valueOf(ch);
            } else if(ch == '.' || ch == '-' || ch == '_') {
                id += String.valueOf(ch);
            }
        }


        for(int i = 0; i < id.length(); i++) {
            if(id.charAt(i) == '.') {
                int j = i+1;
                String dot = ".";

                while(j != id.length() && id.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }

                if(dot.length() > 1)
                    id = id.replace(dot, ".");
            }
        }


        if(id.startsWith(".") ) {
            id = id.substring(1, id.length());
        } else if(id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }


        if(id.length() == 0) {
            id += "a";
        }


        if(id.length() >= 16) {
            id = id.substring(0, 15);
        }


        if(id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }


        String last = id.charAt(id.length()-1) + "";
        if(id.length() == 2) {
            id = id + last;
        } else if(id.length() == 1) {
            id = id + last + last;
        }

        return id;
    }

    public static void main(String[] args) {
        RunSolution24 runSolution24 = new RunSolution24();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(runSolution24.RunSolution24(new_id));
    }
}