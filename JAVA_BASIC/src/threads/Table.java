package threads;

public class Table {

	public  synchronized void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
