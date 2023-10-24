package exp_handling;
public class Throw {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        int sum=0;
        try{
            sum=divide(a,b);
        }
        finally {
            System.out.println(sum);
        }

    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0)
            throw new ArithmeticException();
        else
            return a/b;
    }
}
