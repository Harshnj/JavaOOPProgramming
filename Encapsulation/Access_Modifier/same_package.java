//Refer package and import statement for better understanding of where the files are
package Access_Modifier.subcl;

public class Ex1{

    public static void main(String[] args) {
        Access_Modifier ob1= new Access_Modifier();
         System.out.println(ob1.a);
         System.out.println(ob1.b);
         System.out.println(ob1.c);
        /*
         As d variable declared in Access_Modifier Class is Private , we cant access it outside Access Modifier Class
         We can Access private d variable using getter and setter method.
         System.out.println(d);
        */

    }
}
