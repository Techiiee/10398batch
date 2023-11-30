package threads;

class Thread1 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hey there");
		}
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Hi");
		}
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread thread=new Thread(t1);
		Thread2 t2=new Thread2();
		Thread thread2=new Thread(t2);
		thread.start();
		thread2.start();
	}

}
