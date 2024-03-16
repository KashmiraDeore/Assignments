import java.util.Scanner;
public class Calculator{
    public static void main(String args[])
    {
        char x;
        Double num1,num2,res;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1=input.nextDouble();
        System.out.print("Enter second number: ");
        num2=input.nextDouble(); 
        

        System.out.println("Choose from +, -, * & /  : ");
        x=input.next().charAt(0);
       

        switch(x)
        {
            case '+':
            res=num1+num2;
            System.out.print("Result: "+res);
            break;
            case '-':
            res=num1-num2;
            System.out.print("Result: "+res);
            break;
            case '*':
            res=num1*num2;
            System.out.print("Result: "+res);
            break;
            case '/':
            res=num1/num2;
            System.out.print("Result: "+res);
            break;
            default: 
            System.out.println("Invalid value of x!");
            break;
            
        }
       // System.out.println("Result: "+res);
        input.close();
    }
}