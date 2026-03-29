public class MinSubarraySum {
    static void main() {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int n = arr.length;;
        int minlen = n+1;
        for(int i=0; i< arr.length; i++){
            int sum=0;
            for(int j=i; j< arr.length; j++){
                sum+=arr[j];
                if(sum>= x){
                    minlen = Math.min(minlen, j-i+1);
                    break;
                }
            }
        }
    }
}
