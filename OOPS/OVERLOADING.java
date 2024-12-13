package OOPS;
class calculator{
    void add(int a, int b){
        System.out.println("int-int argument");
    }
    void add(float a, float b){
        System.out.println("float-float argument");
    }
    void add(double a, double b){
        System.out.println("double-double argument");
    }
}
public class OVERLOADING {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(10,20); // int-int
        c.add(10.2f,13.5f); //float-float
        c.add(21.3,13.56); // double-double
    }
}
