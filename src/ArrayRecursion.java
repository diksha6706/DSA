public class ArrayRecursion {
    static void printArray(int[] arr, int idx){
        int n = arr.length;
        if(idx == n){
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    static void main() {
        int[] arr = {5,6,7,8,9};
        printArray(arr, 0);

    }
}
