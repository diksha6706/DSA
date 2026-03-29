import java.util.Scanner;

public class a2remove {
    static String removea2(String s){
        if(s.length()==0){
            return "";
        }
        String smallans = removea2(s.substring(1));
        char current = s.charAt(0);
        if(current !='a'){
            return current+smallans;
        }
        else{
            return smallans;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removea2(s));

    }

}
