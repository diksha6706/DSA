public class LongestPossibleSubarray {
    static void main() {
        int[] arr = {1,2,3,2,3,4,5,1};
        int currentlen =1;
        int maxlen = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                currentlen++;
            }
            else{
                currentlen=1;
            }
            if(currentlen > maxlen){
                maxlen = currentlen;
            }
        }
        System.out.println(maxlen);
    }

}
