//Simple Example to understand the concept of Method_Overloading in java
//Compile-Time Polymorphism
//It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 
//When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. 
//Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.

public class MethodOverloadingExample {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        int sum1 = example.add(5, 10);
        int sum2 = example.add(5, 10, 15);
        double sum3 = example.add(3.5, 2.5);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
