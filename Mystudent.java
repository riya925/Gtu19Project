class College
{
	void lecture(String sna)
	{
		try { Thread.sleep(2000); } catch(Exception e) { }
		System.out.println("\n"+sna+" is in lecture.... ");
	}
	synchronized void viva(String sna)
	{
		try { Thread.sleep(2000); } catch(Exception e) { }
		System.out.println("\n"+sna+" is in viva.... ");
	}
	void exam(String sna)
	{
		try { Thread.sleep(2000); } catch(Exception e) { }
		System.out.println("\n"+sna+" is in exam.... ");
	}
	synchronized void submission(String sna)
	{
		try { Thread.sleep(2000); } catch(Exception e) { }
		System.out.println("\n"+sna+" is doing his/her submission.... ");
	}
}
class Student implements Runnable
{
	Thread th;
	String sna;
	College c;
	Student(String na,College c)
	{
		th=new Thread(this);
		sna=na;
		this.c=c;
		th.start();
	}
	public void run()
	{
		c.lecture(sna);
		c.viva(sna);
		c.exam(sna);
		c.submission(sna);
	}
}
public class Mystudent
{
	public static void main(String[] args)
	{
		College c1=new College();
		Student s1=new Student("liya",c1);
		Student s2=new Student("kinda",c1);
	}
}