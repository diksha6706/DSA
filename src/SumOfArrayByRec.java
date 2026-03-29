public class SumOfArrayByRec {
    static int sumofarr(int[] arr, int idx){
        int n = arr.length;
        if(idx == n-1){
            return arr[idx];
        }
        return arr[idx] + sumofarr(arr, idx+1);
    }

    static void main() {
        int[] arr= {2,3,5,20,1};
        int result = sumofarr(arr,0);
        System.out.println(result);
    }
}
