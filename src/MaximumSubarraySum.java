public class MaximumSubarraySum {
    static void main() {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxsum = arr[0];
        int currentsum = arr[0];
        for(int i=1; i< arr.length; i++){
            currentsum = Math.max(arr[i], currentsum+arr[i]);
            maxsum = Math.max(maxsum, currentsum);

        }
        System.out.println(maxsum);
    }
}
