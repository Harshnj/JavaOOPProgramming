public class Main {
    public void print(){
        System.out.println("In print");
    }
    public void print1(){
        System.out.println("In another print method");
       //accessing or invoking or calling other methiod
        print();
    }
    public static void main(String[] args) {
       Main ob1 = new Main();
       ob1.print1();// As print1 is a non static method we need to create a object to use it
    }
}
