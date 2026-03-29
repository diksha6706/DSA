public class MajorityNby3 {
    static void main() {
        int[] arr = {1, 2, 3, 1, 1, 2, 1};
        int n = arr.length;
        for(int i=0; i< arr.length; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
                if(count> n/3){
                    System.out.println(arr[i]);
                    break;

            }
        }
    }
}
