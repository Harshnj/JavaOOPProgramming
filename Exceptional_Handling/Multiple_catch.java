package exp_handling;
public class multiple_catch {
    public static void main(String[] args) {
        int i=5;
        int j=9;
        int[] num = new int[5];
        try{
         j=j/i;
         i=num[5];
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array invalid index");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);



    }
}
