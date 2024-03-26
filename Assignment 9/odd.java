public class odd 
{
    public static void main(String[] args) {
        try{
            checkEvenNumber(7);
            System.out.println("Number is even");
        }catch(Exception e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
    public static void checkEvenNumber(int number )throws Exception{
        if(number % 2 != 0)
        {
            throw new Exception("Odd number not allowed.");
        }
    }
}
