class A{

}
public class Main extends A{
    int num;

    public Main(int num) {
        this.num = num;
    }
    public Main() {
        this.num = 0;
    }
    @Override
    public String toString() {
        return "Main{}";
    }
    
//HashCode is used to uniquely identify a Class in form of number
//For every objet there s a different unique HashCode
//HashCode is a unique number for every object created
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Main ob1 = new Main(10);
        Main ob2 = new Main(10);
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println("--------------------");
        if(ob1 == ob2){
            System.out.println("==");
        }
        if(ob1.equals(ob2)){
            System.out.println(".equals");
        }

  //instance of-used to check whether that object is a object of the mentioned CLass
  // ob1 instanceof A-Checks if ob1 object is instance of Class A
        System.out.println(ob1 instanceof A);

  //getClass-In Java, the getClass() method is a method provided by the Object class, the root class for all Java classes. It is used to obtain the runtime class of an object. 
  //The getClass() method returns an instance of the Class class, which provides information about the class to which the object belongs
        System.out.println(ob1.getClass());

 }
}
