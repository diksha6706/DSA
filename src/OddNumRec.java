public class OddNumRec {
    static void OddNumbers(int num){
        if(num==0){
            return;
        }
        OddNumbers(num-1);
        if(num%2 != 0){
            System.out.println(num);
        }

    }
    static void main() {
        OddNumbers(9);
    }
}
