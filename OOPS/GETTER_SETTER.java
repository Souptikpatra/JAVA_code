package OOPS;
class studt{
    // data security
    private int roll;
    private String name;
    private String address;

    // setter methods
    public void setRoll(int roll){
        this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;;
    }
    // getter methods
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

}
public class GETTER_SETTER {
    public static void main(String[] args) {
        studt s = new studt();
        // setting student details
        s.setRoll(10);
        s.setAddress("dhaipur");
        s.setName("dip");

        // getting the details
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getRoll());
    }
}