public class LinearSearchRec {
    static boolean linearSearch(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx >= n){
            return false;

        }

        if(arr[idx] == target){
            return true;
        }
//         if(linearSearch(arr, target, idx+1)){
//             return true;
//         }
//         else{
//             return false;
//         }
        return linearSearch(arr, target, idx+1);
    }

    static void main() {
        int[] arr= {4,12,54,14,3,8,6,1};
        int target = 4;
        if(linearSearch(arr, target, 0))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
