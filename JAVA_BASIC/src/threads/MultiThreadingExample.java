package threads;

public class MultiThreadingExample extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hiii");
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
		MultiThreadingExample d=new MultiThreadingExample();//thread creation
		d.setName("first");
		System.out.println(d.getName());
		d.start();
		
		//to join the thread 
		try
		{
			d.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		MultiThreadingExample d1=new MultiThreadingExample();//thread creation
		d1.setName("second");
		System.out.println(d1.getName());
		d1.start();
		
	}

}
