import java.util.Arrays;
public class Array1 
{
    public static void main(String args[])
    {
        int array1[]= {1,2,3,4};
        int array2[]= {1,2,3,4};
        boolean isEqual= Arrays.equals(array1,array2);
        if(isEqual)
        {
            System.out.println("Array are equal!");
        }
        else
        {
            System.out.println("Array are not equal!");
        }
    }
}
