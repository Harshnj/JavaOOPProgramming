//This is a simple example to understand how overriding of method work in java 
class Shape{
    
    void area(){
        System.out.println("I Shape Class");
    }
}
class Rectangle extends Shape{
    @Override 
    void area(){
        System.out.println("Inside Rectangle");
    }
}

class Circle extends Shape{
    
    @Override
    void area(){
        System.out.println("Inside Circle");
    }
}
class Square extends Shape{
    @Override
 

    void area(){
        System.out.println("Inside Square");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shape ob1= new Shape();
        Circle ob2= new Circle();
        Square ob3= new Square();
        Rectangle ob4= new Rectangle();

        ob1.area();
        ob2.area();
        ob3.area();
        ob4.area();

        System.out.println("-----------------------------------");
//Now when we create a object of reference type of Shape Class and create a Object of Square(Sub-Class), here the Square(Sub-Class) overrides the area function in Shape Class
// Hence  instead of printing I am in Shape it prints Inside Square (as Sub class function overrides the Parent class Function) 
        Shape ob5= new Square();
        ob5.area();


    }
}
