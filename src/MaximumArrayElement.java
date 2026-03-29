public class MaximumArrayElement {
    static int maxArray(int[] arr, int idx){
        int n = arr.length;

        if(idx == n-1){
            return arr[idx];
        }
        int smallans = maxArray(arr, idx+1);
        return Math.max(arr[idx], smallans);

    }
    static void main() {
        int[] arr = {5,6,7,8,9};
        maxArray(arr, 0);
        System.out.println (maxArray(arr, 0));

    }
}
