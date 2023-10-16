//Hierarchial INheritance in java
//In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. 

class Box{
    double l;
    double h;
    double w;


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
    Box(BoxPrice Box1){
        this.l=Box1.l;
        this.h=Box1.h;
        this.w=Box1.w;
        System.out.println("In Box Object passed Constructor");
    }
}

class BoxWeight extends Box{
    double wt;
    BoxWeight(){
        this.wt=-1;
        System.out.println("In BoxWeight Default Constructor ");
    }
    BoxWeight(double l, double h, double w, double wt){
        super(l,h,w);
        this.wt=wt;
        System.out.println("In BoxWeight parameterized Constructor");
    }
}

class BoxPrice extends Box{
    double price;
    BoxPrice(){
        this.price=-1;
        System.out.println("In BoxPrice Default Constructor");
    }
    BoxPrice(double l, double h, double w,double price){
        super(l,h,w);
        this.price=price;
        System.out.println("In BoxPrice Parameterized Constructor");

    }
}
class Main{
    public static void main(String[] args) {
        BoxWeight ob1 = new BoxWeight(1,2,1,3);
        System.out.println("-----------------------------------");
        BoxPrice ob2 = new BoxPrice(1,2,3,56);
    }
}
