import java.util.Scanner;
public class Weight 
{
    public static void main(String[] args) 
    {
        Scanner x=new Scanner(System.in);
        System.out.println(" Enter your weight: ");
        double weight=x.nextDouble();
        System.out.println(" Enter your height: ");
        double height=x.nextDouble();
        double BMI= weight * 0.45359237 /(inches * 0.0254 * inches * 0.0254);
        System.out.println("Body mass index is: "+BMI+"\n");

    }
}
