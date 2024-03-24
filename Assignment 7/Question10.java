import java.util.Scanner;
public class Question10 {
    static int array(int arr[],int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        if(arr[n-1]<arr[n-2])
        {
            return 0;
        }
        return array(arr,n-1);
    }
    public static void main(String args[]){
        int arr[]={65,14,129,34,7};
        int n=arr.length;
        if(array(arr,n)!=0)
        {
            System.out.println("Ascending");
        }
        else
        {
            System.out.println("Descending");
        }
        System.out.println("Random");
    }
}
