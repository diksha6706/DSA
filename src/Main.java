public class Main{
    static void main() {
//        int arr[] = {1,1,0,1,1,1};
//        int currentccount = 0;
//        int maxcount = 0;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] == 1){
//                currentccount++;
//                if(currentccount > maxcount){
//                    maxcount = currentccount;
//                }
//
//            }
//            else{
//                currentccount = 0;
//            }
//        }
//        System.out.println(maxcount);


//        int arr[] = {10, 5, 3, 4, 3, 5, 6};
//        boolean isfound = false;
//        for(int i=0; i< arr.length; i++)
//        {
//            for(int j=i+1; j< arr.length; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    isfound = true;
//                    break;
//                }
//                }
//            if(isfound){
//                break;
//            }
//        }
//        int arr[] = {2,3,2,4,3,4,5};
//        for(int i=0; i< arr.length; i++){
//            int count = 0;
//            for(int j=0; j< arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count%2 != 0){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//        int arr[] = {2,2,1,2,3,2,2};
//        int n = arr.length;
//        int k= n/2;
//        for(int i=0; i< arr.length; i++){
//            int count = 0;
//            for(int j=0; j< arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count > k){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int i=0; i<3; i++){
//            int left=0;
//            int right = 2;
//            while(left < right){
//                int temp = arr[i][left];
//                arr[i][left] = arr[i][right];
//                arr[i][right] = temp;
//                left++;
//                right--;
//            }
//        }
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//       }
//        int[][] arr ={
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int n = arr.length;
//        System.out.println(n);
//        int sum =0;
//        for (int i=0; i<n; i++){
//            sum += arr[i][i];
//            if(i != n-1-i){
//                sum += arr[i][n-1-i];
//            }
//        }
//        System.out.println(sum);
//        int arr[] = {1,2,3,4};
//        int n = arr.length;
//        int pref[] = new int[n];
//        pref[0] = arr[0];
//
//        for(int i=1; i<n; i++){
//             pref[i] = pref[i-1] + arr[i];
//
//
//        }
//        for(int i=0; i< pref.length; i++){
//            System.out.println(pref[i]);
//        }
//        int arr[] = {1,-1,2,-2,3};
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i; j< arr.length; j++){
//                if(arr[i]+arr[j] == 0){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//        int[] arr = {1, -1, 2, -2, 3};
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == 0) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        int rows = arr.length;
//        int cols = arr[0].length;
//
//        for (int j = 0; j < cols; j++) {
//            int sum = 0;
//            for (int i = 0; i < rows; i++) {
//                sum += arr[i][j];
//            }
//            System.out.print(sum + " ");
//        }
//        int[][] arr = {{1,2,3}, {4,5,6}};
//        int rows = arr.length;
//        int cols = arr[0].length;
//        for(int j=0;j<cols; j++){
//            int sum = 0;
//            for(int i=0; i<rows; i++){
//                sum += arr[i][j];
//            }
//            System.out.println(sum);
//        }
//        int[][] arr= {{1, 2, 3},
//                {4, 5, 6}
//        };
//        int even =0;
//        int odd = 0;
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j< arr[i].length; j++){
//                if(arr[i][j] %2 ==0){
//                    even++;
//                }
//                else{
//                    odd++;
//                }
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);








    }
}