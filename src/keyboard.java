public class keyboard {
    static void combination(String dig, String[] kp,  String res){
        if(dig.length() == 0){
            System.out.println(res);
            return;
        }
        int curr = dig.charAt(0) -'0';
        String currchoices = kp[curr];
        for(int i=0; i<currchoices.length(); i++){
            combination(dig.substring(1), kp, res+currchoices.charAt(i));

        }

    }
    static void main() {
        String dig = "23";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv" ,"wxyz"};
        combination(dig, kp, "");
    }
}
