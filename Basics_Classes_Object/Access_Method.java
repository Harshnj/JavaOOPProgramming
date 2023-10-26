//
//public class Main {
//    void print(){
//        System.out.println("check");
//    }
//    public static void main(String[] args) {
//        Main ob1 = new Main();In Java, to access a method from the main method when both methods are in the same class, you can create an instance of the class and then call the method on that instance.
//        ob1.print();
//    }
//}
public class Main {
    public static void print(){
        System.out.println("check");//or else u can make it static
    }

    public static void main(String[] args) {
     print();
    }
}

