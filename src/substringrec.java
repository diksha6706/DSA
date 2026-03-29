import java.util.ArrayList;

public class substringrec {
    static ArrayList<String> getssq(String s){

        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char current = s.charAt(0);
        ArrayList<String> smallans = getssq(s.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(current+ss);
        }
        return ans;
    }

    static void main(String[] args) {
        ArrayList<String> ans = getssq("abc");
        for(String ss : ans){
            System.out.println(ss);
        }

    }

}
