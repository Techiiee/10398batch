package threads;

public class FirstThread extends Thread{
	Table t;
	FirstThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.table(5);	
	}
}
class SecondThread extends Thread
{
	Table t;
	public SecondThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.table(2);
		
	}

}