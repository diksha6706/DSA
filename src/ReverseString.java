import java.util.Scanner;

public class ReverseString {

    static String removeA(String s, int idx){
        if(idx == s.length()){
            return "";
        }
        String smallans = removeA(s, idx+1);
        char current = s.charAt(idx);

        return smallans + s.charAt(idx);

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));

    }
}
