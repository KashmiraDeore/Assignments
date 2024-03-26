public class Exe {
    public static void main( String[] args) {
        try{
            int num=0;
            if(num>10){
            throw new ArithmeticException();
            }
            else if(num==0){
            throw new NullPointerException(); 
            } 
        }
        catch (final NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Number1");
        }
        catch (final NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Number2");
        }
        catch (final ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Number3");
        }
    }
}