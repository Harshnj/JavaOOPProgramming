//Refer package and import statement for better understanding of where the files are
package Access_Modifier.SubClass;

import Access_Modifier.subcl.Access_Modifier;

public class Ex2 extends Access_Modifier {
    public static void main(String[] args) {
        Ex2 ob1 = new Ex2();

        System.out.println(ob1.a);
        // We can only  access protected variable b in different package because it is a sub class of the memebers class its accessing
        // If we dont make this class sub class we cant access b (protected) variable outside different package
        System.out.println(ob1.b);
/*
      We cant access C variable as it has DEFAULT access modifier so we cant access that variable in different package even if we apply inheritance
      System.out.println(c);
      As d variable declared in Access_Modifier Class is Private so we cant access it outside Access Modifier Class
      System.out.println(d);
*/


    }
}
