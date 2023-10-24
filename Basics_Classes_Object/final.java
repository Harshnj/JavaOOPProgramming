//final - methods, variables, Class

class Box{
    double l;
    double h;
    double w;


    static void print(){
        System.out.println("In Static Box Class");
    }

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
}

// Final Class now BoxWeight class cant be inherited by any other classes
final class BoxWeight extends Box{
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
    BoxWeight(BoxWeight Box1){
        super(Box1);
        this.wt=Box1.wt;
        System.out.println("In BoxWeight Object passed Constructor");
    }

    static void print(){
        System.out.println("Inside Static BoxWeight Class   ");
    }

}

//class BoxPrice extends BoxWeight{ // Cant extend/inherit properties of BoxWeight to BoxPrice
 class BoxPrice{

    //If you make any variable as final, you cannot change the value of final variable(It will be constant).
   //Final Variables value can be different for different objects
    final double price;

    BoxPrice(){
        this.price=-1;
        System.out.println("In BoxPrice Default Constructor");
    }
    BoxPrice(double price){
        this.price=price;
        System.out.println("In BoxPrice Parameterized Constructor");
    }

}
class Main{
    public static void main(String[] args) {
        BoxWeight ob1 = new BoxWeight();
        BoxPrice ob2 = new BoxPrice(10);
        System.out.println(ob2.price);
        BoxPrice ob3 = new BoxPrice(100);
        System.out.println(ob3.price);

    }
}
