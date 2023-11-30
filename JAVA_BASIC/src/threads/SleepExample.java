package threads;

public class SleepExample extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hii");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args) {
		SleepExample d=new SleepExample();//thread creation
		d.start();

	}

}