public class SearchAnElement {
    static void main() {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        boolean found = false;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==key){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}