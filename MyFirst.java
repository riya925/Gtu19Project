import java.util.Scanner;
import java.lang.Exception;

public class MyFirst
{
	public static void main(String[] args)
	{
		int a,b,c=0;
		
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter no1 : ");
			a=scan.nextInt();
			
			System.out.println("Enter no2 : ");
			b=scan.nextInt();
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("\n There is an exception.... ");
		}
		System.out.println("\n Div : "+c);
	}
}
