package Basic;

class OuterClass{
    int a=10;
    void print(){
        System.out.println("In Outer Clas");
    }
    class InnerCLass{
        int a=10;
        void print(){
            System.out.println("In Inner Class");
        }

    }
}
public class Example_Inner_Class {
    public static void main(String[] args) {
        OuterClass ob1 = new OuterClass();
        OuterClass.InnerCLass ob2 = ob1.new InnerCLass();
        System.out.println(ob1.a);
        ob1.print();
        System.out.println(ob2.a);
        ob2.print();

    }
}
