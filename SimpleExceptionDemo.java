//Carson Samples
//Lab Assignment 12
//10.24.26
//Course CMP-129-80231
public class SimpleExceptionDemo 
{
    public static void safeDivide(int numerator, int denominator)
    {
        //trying to divide the 2 numbres given 
        try
        {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        //catches if there is a divison by zero and states it
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide by zero");
        }
        //states division operation is complete
        finally
        {
            System.out.println("Division Operation Is Complete.");
        }
    }
    public static void main(String [] args)
    {
        //tests safeDivide method
        safeDivide(20,4);
        safeDivide(15,0);
        safeDivide(-30,5);
    }
}

