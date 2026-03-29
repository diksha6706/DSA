
import java.util.*;   // List, ArrayList, Iterator, ListIterator ke liye

public class ListExample {
    public static void main(String[] args) {

        // Step 2: List banayi jo String type ka data store karegi
        List<String> items = new ArrayList<>();

        // Step 3: List me kuch items add kiye
        items.add("Apple");
        items.add("Banana");
        items.add("Mango");
        items.add("Orange");


        // 1. For-each loop se print karna

        System.out.println("Using For-Each Loop:");
        for(String item : items) {
            System.out.println(item);
        }


        // 2. Iterator se print karna

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = items.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }


        // 3. ListIterator se print karna

        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIt = items.listIterator();

        while(listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        // ListIterator backward bhi chalta hai
        System.out.println("\nUsing ListIterator (Backward):");
        while(listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }
}