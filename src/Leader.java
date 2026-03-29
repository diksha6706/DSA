public class Leader {
    static void main() {
        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
        int max = arr[n-1];
        int count =1;
        System.out.println(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
                count++;
            }
        }
        System.out.println(count);
    }
}
