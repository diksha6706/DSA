public class MaxProductSubarray {
    static void main() {
        int[] arr={2, 3, -2, 4};
        int maxpro = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int product = 1;
            for(int j=i; j< arr.length; j++){
                product *= arr[j];
                maxpro = Math.max(maxpro, product);
            }

        }
        System.out.println(maxpro);
    }
}
