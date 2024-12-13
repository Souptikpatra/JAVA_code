package HashMap_HashSet;
import java.util.HashMap;
public class HASHMAP_Basics {
    public static void main(String[] args) {

        HashMap<String, Integer> HM = new HashMap<>();
        HM.put("dip", 21); // Adds the entry (key, value) -> ("dip", 21)
        HM.put("putu", 20); // Adds the entry ("putu", 20)
        HM.put("bapi", 67); // Adds the entry ("bapi", 67)

        System.out.println(HM); // Prints the content of the HashMap, e.g., {putu=20, dip=21, bapi=67}
        System.out.println(HM.size()); // Prints the size of the HashMap, which is 3

        System.out.println(HM.containsValue(20)); // Checks if value 20 is present, prints true
        System.out.println(HM.containsValue(19)); // Checks if value 19 is present, prints false

        System.out.println(HM.containsKey("putu")); // Checks if key "putu" is present, prints true
        System.out.println(HM.containsKey("bristy")); // Checks if key "bristy" is present, prints false

        System.out.println(HM.get("putu")); // Retrieves the value for key "putu", prints 20

        HM.remove("dip"); // Removes the entry with key "dip", i.e., ("dip", 21)
        System.out.println(HM); // Prints the HashMap after removal, e.g., {putu=20, bapi=67}

        System.out.println(HM.size()); // Prints the new size of the HashMap, which is 2

        HM.put("dip", 21); // Re-adds the entry ("dip", 21)
        System.out.println(HM); // Prints the updated HashMap, e.g., {putu=20, bapi=67, dip=21}

        HM.put("bristy", 20); // Adds the entry ("bristy", 20), showing that duplicate values are allowed
        System.out.println(HM); // Prints the updated HashMap, e.g., {putu=20, bapi=67, dip=21, bristy=20}

        HM.put("dip", 22); // Updates the value for the existing key "dip" to 22
        System.out.println(HM); // Prints the HashMap, showing that the value has been updated, e.g., {putu=20, bapi=67, dip=22, bristy=20}


    }
}
