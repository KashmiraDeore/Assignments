import java.util.Scanner;
public class Question010 
{
    public static void main(String[] args) {
        int arr[]={5,14,35,90,139};
        String order = checkOrder(arr);
        System.out.println("Order: "+order);

    }
    public static String checkOrder(int arr[])
    {
        boolean  ascending = true;
        boolean descending = true;
        for(int i=1;i<arr.length; i++)
        {
            if(arr[i]<arr[i - 1])
            {
                ascending = false;
            }
            if(arr[i]> arr[i-1])
            {
                descending = false;
            }
        }    
        if(ascending)
        {
            return "Ascending";
        }
        else if(descending)
        {
            return "Descending";
        }
        else
        {
            return "Random";
        }

    }
}
