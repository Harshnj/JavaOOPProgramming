//final - methods, variables, Class

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
    Box(BoxWeight Box1){
        this.l=Box1.l;
        this.h=Box1.h;
        this.w=Box1.w;
        System.out.println("In Box Object passed Constructor");
    }

    final void print(){
        System.out.println("Inside Box Class and this cant be overriden by any sub class due to final keyword ");
    }
}

// Final Class
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

//     void print(){
//        System.out.println("Inside Static BoxWeight Class cant override print() method in SuperClass   ");
//    }

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
   Box ob1 = new Box();
   ob1.print();

    }
}
