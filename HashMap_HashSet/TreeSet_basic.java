package HashMap_HashSet;
import java.util.TreeSet;
import java.util.HashSet;
public class TreeSet_basic {
        public static void main(String[] args) {
            // TreeSet example (ordered set)
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("Banana");
            treeSet.add("Apple");
            treeSet.add("Mango");
            treeSet.add("Grapes");

            System.out.println("TreeSet (ordered): " + treeSet);
            // Output will be in lexicographical order: [Apple, Banana, Grapes, Mango]

            // HashSet example (unordered set)
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("Banana");
            hashSet.add("Apple");
            hashSet.add("Mango");
            hashSet.add("Grapes");

            System.out.println("HashSet (unordered): " + hashSet);
            // Output will be in arbitrary order, e.g., [Mango, Grapes, Banana, Apple]
        }
    }


