import java.util.Set;
import java.util.HashSet;

    public class Hashset {
        public static void main(String[] args) {

            // a. Add items in the set
            Set<String> set1 = new HashSet<>();
            set1.add("Lean");
            set1.add("XP");
            set1.add("Kanban");

            System.out.println("Set1: " + set1);

            // b. Insert items of one set into another set
            Set<String> set2 = new HashSet<>();
            set2.add("Scrum");

            set2.addAll(set1);
            System.out.println("Set2 after inserting Set1: " + set2);

            // c. Remove items from the set
            set2.remove("XP");
            System.out.println("Set2 after removing XP: " + set2);

            // d. Search the specified item in the set
            if (set2.contains("Kanban")) {
                System.out.println("Kanban is found in the set");
            } else {
                System.out.println("Kanban is not found in the set");
            }
        }
    }
