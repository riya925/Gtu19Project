import java.util.Scanner;

class CaseException extends Exception
{
	String a;
	CaseException(String a)
	{
		this.a=a;
	}
	public String toString()
	{
		return "\n Wrong gender.... ";
	}
}
public class Gender
{
	public static void main(String[] args)
	{
		String g;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter your gender : ");
		g=scan.nextLine();
		
		try
		{
			if(g.equalsIgnoreCase("male") || g.equalsIgnoreCase("female"))
			{
				System.out.println("\n Gender is correct.... ");
			}
			else
			{
				throw new CaseException(g);
			}
		}
		catch(CaseException ce)
		{
			System.out.println(ce);
		}
	}
}