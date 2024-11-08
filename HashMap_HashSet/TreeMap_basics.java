package HashMap_HashSet;
import java.util.TreeMap;
import java.util.HashMap;
public class TreeMap_basics {
        public static void main(String[] args) {
            // TreeMap example (ordered map)
            TreeMap<String, Integer> treeMap = new TreeMap<>();
            treeMap.put("Banana", 3);
            treeMap.put("Apple", 5);
            treeMap.put("Mango", 2);
            treeMap.put("Grapes", 4);

            System.out.println("TreeMap (ordered): " + treeMap);
            // Output will be in lexicographical order of keys: {Apple=5, Banana=3, Grapes=4, Mango=2}

            // HashMap example (unordered map)
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Banana", 3);
            hashMap.put("Apple", 5);
            hashMap.put("Mango", 2);
            hashMap.put("Grapes", 4);

            System.out.println("HashMap (unordered): " + hashMap);
            // Output will be in arbitrary order, e.g., {Mango=2, Apple=5, Banana=3, Grapes=4}
        }
    }

