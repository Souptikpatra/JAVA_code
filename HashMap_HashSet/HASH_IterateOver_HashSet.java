package HashMap_HashSet;

import java.util.HashSet;

public class HASH_IterateOver_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        HS.add(40);
        for (int ele: HS){
            System.out.print(ele+" ");
        }

    }
}
