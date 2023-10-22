package Abstract.Class;

abstract class Car{
    abstract void drive(); //Methid is declared but not defined

}

class Wagon extends Car {
    void drive(){
        System.out.println("Driving Wagon"); // Method is defined
    }
    void music(){
        System.out.println("Playing");
    }
}
public class Main {
    public static void main(String[] args) {
        Car ob = new Wagon();//Method Ovewrring
        ob.drive();
         }
}
