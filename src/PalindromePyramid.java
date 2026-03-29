public class PalindromePyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int num = i; num >= 1; num--) {
                System.out.print(num);
            }

            for (int num = 2; num <= i; num++) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}
