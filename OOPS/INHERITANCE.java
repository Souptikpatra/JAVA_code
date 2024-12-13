package OOPS;

class person{ // prent class
    public String name;
    public String adds;
    public int age;
}

class Student extends person{ // child class
    public int marks;
    public char grade;

    Student (String name, String adds, int age, int marks, char grade){ // constructor
        this.name = name;
        this.adds = adds;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp(){
        System.out.println("name: "+ name);
        System.out.println("adds: "+ adds);
        System.out.println("age: "+ age);
        System.out.println("marks"+ marks);
        System.out.println("grade: "+ grade);
    }

}
public class INHERITANCE {
    public static void main(String[] args) {
        Student s = new Student("dip","dhainpur",21,98,'A');
        s.disp();
    }
}
