import java.util.Scanner;

public class Palindrome {
    static String removeA(String s, int idx){
        if(idx == s.length()){
            return "";
        }
        String smallans = removeA(s, idx+1);
        char current = s.charAt(idx);
        if(current != 'a'){
            return current+smallans;
        }
        return smallans;

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        String rev = removeA(s, 0);
        if(rev.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }

    }
}
