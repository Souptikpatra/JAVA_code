package sorting_algorithm;
public class move_zeroes_atEnd_leet_283_m2_bubble {
    public static void print_array(int [] temp){
        System.out.print("[ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        int n = arr.length;
        int noz = 0; // noz = no of zeroes
        // counting no of zeroes
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) noz++;
        }
        // general buuble sort code
        for (int x = 0; x < noz; x++) { // no of passes = noz
            for (int k = 0; k < n-1-x; k++) {
                if (arr[k] == 0) {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        print_array(arr);
    }
}
