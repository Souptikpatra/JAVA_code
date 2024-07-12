public class hcf_iterative {
    public static int hcf(int a, int b){
        for (int i = Math.min(a,b); i > 1 ; i--) {
            if (b % i == 0 && a % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(hcf(6,2));
    }
}
