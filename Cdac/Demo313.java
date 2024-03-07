import java.util.Scanner;
class Demo313{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=s.nextInt();
	for(int i=0;i<10;i++)
	{
	  System.out.print("\n"+(i+1)+"="+(n*(i+1)));
	}
 }
}