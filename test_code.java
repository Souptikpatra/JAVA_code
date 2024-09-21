class demo{
    // exactMatch : one argument
    public void method(int i){
        System.out.println("general method...");
    }
    // var-args : can take 0 ... n arguments
    public void method(int ... i){
        System.out.println("var-args method...");
    }
}

class test_code{
    public static void main(String[] args) {
        demo d = new demo();
        d.method(); // 0 argument --> will be called for var-args method
        d.method(10); // 1 argument --> general method as well var-args method both can handle 1 argument, but priority goes to general method(as it exactMatch)
        d.method(10,20); // 2 argument --> will call for var-args method

    }
}