public class Bound 
{
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3};
            int element=arr[3];
            System.out.println("Element: "+element);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
    
}
