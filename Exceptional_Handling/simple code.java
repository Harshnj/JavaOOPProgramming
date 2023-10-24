package exp_handling;
public class Main {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try {
            int c = a / b;//What ever can cause exception is put in try block
        }
        catch (Exception e){
            System.out.println(e.getMessage());//If the exception is caught in try block, this block is executed
        }
        finally {
            System.out.println("Finally-> no matter what , this finally block is executed");
        }
    }
}
