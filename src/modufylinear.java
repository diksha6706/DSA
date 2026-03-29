public class modufylinear {
    static int linearSearch(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx >= n){
            return -1;

        }

        if(arr[idx] == target){
            return idx;
        }

        return linearSearch(arr, target, idx+1);
    }

    static void main() {
        int[] arr= {4,12,54,14,3,8,6,1};
        int target = 0;
        System.out.println(linearSearch(arr, target,0));
        }
    }

