package Abstract.Class;

abstract class Car{
    abstract void drive();
/*
    The abstract keyword is used for methods that are meant to be overridden in subclasses, but static methods belong to the class itself and are not tied to specific instances or objects.
    They are called on the class, not on instances of the class. Therefore, static methods are inherently not part of the inheritance hierarchy.
     abstract static void prnit(){
        System.out.println("Inside Static block");
    }
*/

}

class Wagon extends Car {
    void drive(){
        System.out.println("Driving Wagon");
    }
    void music(){
        System.out.println("Playing");
    }
}
public class Main {
    public static void main(String[] args) {
        Car ob = new Wagon();
        ob.drive();



    }
}
