public class LeaderAlternate {
    static void main() {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        for(int i=0; i< arr.length; i++){
            boolean isleader = true;
            for(int j = i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    isleader = false;
                    break;
                }
            }
            if(isleader){
                System.out.println(arr[i]);
            }
        }
    }
}
