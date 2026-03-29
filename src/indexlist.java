import java.util.ArrayList;

public class indexlist {
    static ArrayList<Integer> allIndices(int[] arr, int target, int idx){
        int n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx>= n){
            return ans;
        }

        if(arr[idx]== target){
            ans.add(idx);
        }
        ArrayList<Integer> smallans = allIndices(arr, target, idx+1);
        ans.addAll(smallans);
        return ans;
    }
   public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,2,1};
        int target = 2;
        ArrayList<Integer> ans = allIndices(arr, target, 0);
        for(Integer i: ans){
            System.out.println(i);
        }



    }
}
