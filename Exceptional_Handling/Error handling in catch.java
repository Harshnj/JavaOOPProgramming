package exp_handling;
public class error_handling_catch {
    public static void main(String[] args) {
        int i=0;
        int j=9;
        int[] num = new int[5];
        try{
            j=j/i;
            i=num[5];
        }
        catch(ArithmeticException e){
            j=j/1;//Handling the error
            System.out.println("cant divide it by zero so the default value is "+j);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array invalid index");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Final value of j is "+j);



    }
}
