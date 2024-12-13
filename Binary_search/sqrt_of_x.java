package Binary_search;
public class sqrt_of_x {
    public static int sqrt(int x){
        // no need to make an array,
        int low = 0; int high = x;
        int mid;
        if (x <= 1) return x;
        while(low <= high){
            mid = low + (high-low)/2;
            /* instead of using 'long'
            we can make ( mid * mid == x ) --> (mid == x/mid)
             */
            if (mid == x/mid) return mid;
            else if (mid > x/mid) high = mid - 1;
            else if (mid < x/mid) low = mid + 1;
        }
        return high; // when loop exits by its condition ( low <= high )
        // after that 'high' is definitely pointing to sqrt(x)
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}
