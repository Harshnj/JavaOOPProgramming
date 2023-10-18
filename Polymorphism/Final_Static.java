class Box{
    double l;
    double h;
    double w;
    // A final static variable in Java represents a constant.
    // It is a variable whose value cannot be changed after it's assigned a value.
    // This is similar to a regular final variable, but it's shared across all instances of the class.
    final static String str ="Box Details";
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
        System.out.println("In Box Default Constructor");
    }
    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
        System.out.println("In Box Parameterized constructor");

    }
    Box(BoxWeight Box1){
        this.l=Box1.l;
        this.h=Box1.h;
        this.w=Box1.w;
        System.out.println("In Box Object passed Constructor");
    }
    //A final static method is a method that cannot be overridden by subclasses. 
    //It's a method that has a fixed implementation in the class, and it cannot be changed in any subclass.
    //This ensures that the behavior of the method remains consistent throughout the class hierarchy.
    final static void print(){
        System.out.println("Inside Box Class and this cant be overriden by any sub class due to final keyword ");
    }
}

// Final Class
final class BoxWeight extends Box {
    double wt;

    BoxWeight() {
        super();
        this.wt = -1;
        System.out.println("In BoxWeight Default Constructor ");
    }

    BoxWeight(double l, double h, double w, double wt) {
        super(l, h, w);
        this.wt = wt;
        System.out.println("In BoxWeight parameterized Constructor");
    }

    BoxWeight(BoxWeight Box1) {
        super(Box1);
        this.wt = Box1.wt;
        System.out.println("In BoxWeight Object passed Constructor");
    }
}

    class BoxPrice {

        final double price;

        BoxPrice() {
            this.price = -1;
            System.out.println("In BoxPrice Default Constructor");
        }

        BoxPrice(double price) {
            this.price = price;
            System.out.println("In BoxPrice Parameterized Constructor");
        }
    }

        class Main {
            public static void main(String[] args) {
                Box ob1 = new Box();
                ob1.print();

            }
        }
