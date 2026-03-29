import java.util.Scanner;

public class Palindrome2 {
    static boolean ispalidrome(String s, int l, int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && ispalidrome(s, l+1, r-1));
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ispalidrome(s, 0, s.length()-1));

    }
}
