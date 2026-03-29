public class Subsequences {
    static void ssqprint(String s, String currans){
        if(s.length() == 0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String remstr = s.substring(1);
        ssqprint(remstr, currans+curr);
        ssqprint(remstr, currans);
    }

    static void main() {
        ssqprint("abc", "");


    }
}
