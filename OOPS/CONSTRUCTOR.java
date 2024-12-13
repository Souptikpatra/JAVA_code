package OOPS;
class emploee{
    // instance variable
    int age;
    String name;
    // zero argument constructor
    emploee(){
        System.out.println("constructor is calling ...");
    }
    void disp(){
        System.out.println("age "+ age);
        System.out.println("name "+ name);
    }
}
public class CONSTRUCTOR {
    public static void main(String[] args) {
        emploee e1 = new emploee();
        e1.disp();
    }
}
