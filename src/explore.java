import java.util.Scanner;

public class explore {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<n; i++){
           arr[i]= sc.nextInt();
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
