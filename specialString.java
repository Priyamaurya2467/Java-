public class specialString {
    public static void main(String[] args) {
        String s = "p##";
        String ans = processStr(s);
        System.out.println(ans);
    }

        static String processStr (String s){
            StringBuilder sb = new StringBuilder(5);
            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);
                if (Character.isLetter(ch)) {
                    sb.append(ch);
                } else if (ch == '*') {

                    if(sb.length()>=1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }

                } else if (ch == '#') {
                    if(sb.length()>=1) {
                        sb.append(sb);

                    }

                } else if (ch == '%') {
                     sb.reverse();
                }


            }
            String result = sb.toString();
            return result;


        }
    }
