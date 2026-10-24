//Carson Samples
//Lab Assignment 12
//10.24.26
//Course CMP-129-80231
public class SimpleExceptionDemo 
{
    public static void safeDivide(int num, int den)
    {
        try
        {
            int result = num / den;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide by zero");
        }
        finally
        {
            System.out.println("Division Operation Is Complete.");
        }
    }
    public static void main(String [] args)
    {
        safeDivide(20,4);
        safeDivide(15,0);
        safeDivide(-30,5);
    }
}

