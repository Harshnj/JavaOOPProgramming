
interface AB{
    void print();
    default void print1(){
        System.out.println("In default block");
    }
    static void print3(){
        System.out.println("Insdie Static block");
    }
}
class D implements AB {
    @Override
    public void print() {
        System.out.println("Inside interface method");
    }
}
public class Static_Interface {
    public static void main(String[] args) {
        AB.print3();
    }
}
