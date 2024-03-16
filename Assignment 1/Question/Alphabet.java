import java.util.Scanner;
public class Alphabet
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch=obj.next().charAt(0);
        obj.close();
        if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
        {
            System.out.print("It's a Vowel!");
        }
        else
        {
            System.out.print("It's a Consonent!");
        }
    }
}
