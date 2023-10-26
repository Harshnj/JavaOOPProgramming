interface A{
    void print();
    default void print1(){
        System.out.println("In default block");
    }
}
 class C implements A {
    @Override
    public void print() {
        System.out.println("Inside interface method");
    }
    public void print1(){//In Java, when you implement a method from an interface, you must use the public access modifier.
        System.out.println("In overriding method for default ");
    }
}


public class int_ex{
    public static void main(String[] args) {
        C ob1 = new C();
        ob1.print();
        ob1.print1();
    }
}


