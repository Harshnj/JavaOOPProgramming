package Access_Modifier.subcl;
public class Access_Modifier {
    public int a=10; // Can be accessed anywhere
    protected float b=1.23f; //The protected access modifier is specified using the keyword protected.The methods or data members declared as protected are accessible within the same package or subclasses in different packages.

    long c = 23568;// When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package.

    private double d= 2.2655;//The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared.

}
