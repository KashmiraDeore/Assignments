import java.util.Scanner;
public class Weekday 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int x=0;
        System.out.println("Eneter Weekday number: ");
        x=obj.nextInt();
        switch (x)
        {
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default: 
            System.out.println("Invalid input!");
            break;

        } 
    }
}
