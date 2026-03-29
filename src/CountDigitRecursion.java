public class CountDigitRecursion {
    static int Count(int n, int digit){
        if (n==0){
            return 0;
        }
        if(n%10 == digit){
            return 1 + Count(n/10, digit);
        }
        else{
            return Count(n/10, digit);
        }
    }
    static void main() {
        int number = 1223342;
        int digit = 2;

        int ans = Count(number, digit);
        System.out.println(ans);

    }
}
