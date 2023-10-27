package Error_Exception;
public class Main {
    public static void main(String[] args) {
        // Calculate and print the average of three numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        double average = num1 + num2 + num3 / 3; // Incorrect logic
        //Average is 20  but its printing 40
        System.out.println("The average is: " + average);
    }
}
