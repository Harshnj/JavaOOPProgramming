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
    BoxWeight(BoxPrice Box1){
        super(Box1);
        this.wt=Box1.wt;
        System.out.println("In BoxWeight Object passed Constructor");
    }

    static void print(){
        System.out.println("Inside Static BoxWeight Class   ");
    }

}

class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        this.price=-1;
        System.out.println("In BoxPrice Default Constructor");
    }
    BoxPrice(double l, double h, double w, double wt,double price){
        super(l,h,w,wt);
        this.price=price;
        System.out.println("In BoxPrice Parameterized Constructor");

    }
    BoxPrice(BoxPrice Box1){
        super(Box1);
        this.price=Box1.price;
        System.out.println("In BoxPrice Object passed Constructor");
    }
}
class Inheritance{
    public static void main(String[] args) {
        BoxPrice Box1 = new BoxPrice(1,2,3,4,5);
        System.out.println("-------------------------------------------------");
        BoxPrice Box2= new BoxPrice(Box1);
        System.out.println("-------------------------------------------------");
        System.out.println(Box1.l+ " " + Box1.h+ " "+Box1.w+ "  " +Box1.wt+ " " +Box1.price);
        System.out.println("-------------------------------------------------");
        System.out.println(Box2.l+ " " + Box2.h+ " "+Box2.w+ "  " +Box2.wt+ " " +Box2.price);
        System.out.println("-------------------------------------------------");
        BoxWeight Box3 = new BoxWeight();
        //Here BoxWeight and Box Both class have a static print method
        //But Static methods are not overriden Because the static methos can be directly accessed by Class name and they dont depend on object
        //Static methods dont depend on objects 
        System.out.println("-------------------------------------------------");
        BoxWeight.print();
        Box.print();
    }
}
