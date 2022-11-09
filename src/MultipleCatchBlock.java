import java.lang.reflect.Array;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        try{
            int a[] = new int[5];
            a[5] = 55/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {


            System.out.println("Exception occurs");
        }

    }
}