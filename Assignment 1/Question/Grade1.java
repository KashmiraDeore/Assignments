import  java.util.Scanner;
public class Grade1
{
        public static void main(String args[])
        {
        int x;
        char grade;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the marks scored: ");
        x=obj.nextInt();
        if(x>=90)
        {
            grade='A';
        }
        else if(x>=80)
        {
            grade='B';
        }
        else if(x>=60)
        {
            grade='C';
        }
        else
        {
            grade='D';
        }
        System.out.print("Your grade is: "+grade);
    }
}