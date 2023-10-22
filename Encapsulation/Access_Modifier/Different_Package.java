//Refer package and import statement for better understanding of where the files are
package Access_Modifier;

import Access_Modifier.subcl.Access_Modifier;

public class outside{
    public static void main(String[] args) {
        Access_Modifier ob1 = new Access_Modifier();

        System.out.println(ob1.a);
        //We cant access b (protected variable) as this class is in different package and this class does not inherits the Main class
        //System.out.println(ob1.b);
/*
      We cant access C variable as it has DEFAULT access modifier so we cant access that variable in different package even if we apply inheritance
      System.out.println(c);
      As d variable declared in Access_Modifier Class is Private so we cant access it outside Access Modifier Class
      System.out.println(d);
*/

    }


}
