public class Arith
{
    public static void main(String args[])
    {
        try{
            int res = divideByZero();
            System.out.println("Result : "+res);


        }catch(ArithmeticException e){
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
    public static int divideByZero()
    {
        int numerator=10;
        int denominator=0;
        return numerator/denominator;
    }
}