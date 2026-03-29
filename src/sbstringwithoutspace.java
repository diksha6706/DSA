public class sbstringwithoutspace {
    static void printssq(String s, String currentans){

       if(s.length()==0){
           System.out.println(currentans);
           return;
       }
       char curr = s.charAt(0);
       String remstring = s.substring(1);
       printssq(remstring, currentans+curr);
       printssq(remstring, currentans);
    }
    static void main(String[] args) {
        printssq("abc","");


    }

}
