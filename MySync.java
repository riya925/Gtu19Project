class Database
{
	void read(String na)
	{
		System.out.println(na+" user has started reading the database.... ");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e1) { }
		System.out.println(na+" user has stopped reading the database.... ");
	}
	
	void edit(String na)
	{
		System.out.println(na+" is editing the data.... ");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e1) { }
		System.out.println(na+" is not editing the data now !!!! ");
	}
}
class user implements Runnable
{
	Thread th;
	Database db;
	String na;
	user(String na,Database db)
	{
		th=new Thread(this);
		this.na=na;
		this.db=db;
		th.start();
	}
	public void run()
	{
		db.read(na);
		if(na.equals("Super user"))
		{
			db.edit(na);
		}
		else
		{
			synchronized(db)
			{
				db.edit(na);
			}
		}
	}
}
public class MySync
{
	public static void main(String[] args)
	{
		Database db=new Database();
		
		user u1=new user("Thread 1",db);
		user u2=new user("Thread 2",db);
		user u3=new user("Thread 3",db);
		user u4=new user("Super user",db);
	}
}