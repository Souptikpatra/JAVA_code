package sorting_algorithm;
import java.util.ArrayList;
public class move_zeroes_atEnd_leet_283_m1 {
    // Push zeroes to end while maintaining the relative order  of other elements.
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        int noz = 0; // number of zero counter
        ArrayList<Integer> arrl = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arrl.add(arr[i]);
            }
            else noz++;
        }
        // filling number of zeroes at last
        for (int i = 1; i < noz; i++) {
            arrl.add(0);
        }
        System.out.println(arrl);
    }

}
