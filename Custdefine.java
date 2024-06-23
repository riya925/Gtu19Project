import java.util.*;

class CustomException extends Exception
{
	int m;
	CustomException(int a)
	{
		m=a;
	}
	public String toString()
	{
		return "\n Invalid marks.... ";
	}
}

public class Custdefine
{
	public static void main(String[] args)
	{
		int m;
		Scanner scan=new Scanner(System.in);
				
		System.out.println("\n Enter the marks of the one subject : ");
		m=scan.nextInt();
				
		try
		{
			if(m<0)
			{
				throw new CustomException(m);
			}
			else if(m>100)
			{
				throw new CustomException(m);
			}
			else
			{
				System.out.println("\n Marks are allright.... ");
			}
		}
		catch(CustomException ce)
		{
			System.out.println(ce);
		}
	}
}