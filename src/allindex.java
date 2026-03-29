public class allindex {
    static void linearSearch(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx >= n){
            return;
        }

        if(arr[idx] == target){
            System.out.println(idx);
        }
//
        linearSearch(arr, target, idx+1);
    }

    static void main() {
        int[] arr= {4,1,1,2,1,3,1};
        int target = 1;
        linearSearch(arr, target, 0);
    }
}
