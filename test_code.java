public class test_code {
    public static void print(int n){
        if (n == 0) return;
        else {
            print(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}