class Box{
    double l;
    double h;
    double w;
    double wt;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
        this.wt=-1;
        System.out.println("In Box Default Constructor");
    }
    Box(double l, double h, double w,double wt){
        this.l=l;
        this.h=h;
        this.w=w;
        this.wt=wt;
        System.out.println("In Box Parameterized constructor");

    }
}

class BoxWeight extends Box{
    double wt;
    BoxWeight(){
        this.wt=-1;
        System.out.println("In BoxWeight Default Constructor ");
    }
    BoxWeight(double l, double h, double w, double wt,double wtp){
        super(l,h,w,wt);
        this.wt=wtp;
        System.out.println("In BoxWeight parameterized Constructor");
    }
}

class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        this.price=-1;
        System.out.println("In BoxPrice Default Constructor");
    }
    BoxPrice(double l, double h, double w, double wt,double wtp,double price){
        super(l,h,w,wt,wtp);
    this.price=price;
        System.out.println("In BoxPrice Parameterized Constructor");

    }
}
class Main{
    public static void main(String[] args) {
        BoxPrice Box1 = new BoxPrice(1,2,3,4,5,6);
        System.out.println(Box1.l);


    }
}
