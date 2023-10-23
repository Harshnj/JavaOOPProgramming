public class Main {
    static int b=0;
    static{
        b += 6;
    }
    static {
        b += 7; //This is Static block used to initialize a static variable.This will run only once.
    }

    public static void main(String[] args) {
        Main ob1 = new Main();
        System.out.println(ob1.b);
        System.out.println(Main.b);
    }
}
