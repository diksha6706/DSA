public class CountEvenDigits {
    static int countDigit(int n){
        if (n==0){
            return 0;
        }
        int lastdigit = n%10;
        if(lastdigit%2 ==0){
            return 1+countDigit(n/10);
        }
        else{
            return countDigit(n/10);
        }
    }
    static void main() {
        int number = 248531;
        int result = countDigit(number);
        System.out.println(result);
    }
}
