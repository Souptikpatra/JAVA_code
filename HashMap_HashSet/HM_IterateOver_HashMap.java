package HashMap_HashSet;
import java.util.HashMap;
public class HM_IterateOver_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("dip",21);
        hm.put("putu",20);
        hm.put("bristy",20);
        // keySet()
        for(String key : hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
        System.out.println();

        // entrySet()
        for (Object pair : hm.entrySet()){
            System.out.println(pair);
        }
    }
}
