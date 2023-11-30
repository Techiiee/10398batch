package threads;

public class Demo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Demo2 demo2=new Demo2();
		Thread t=new Thread(demo2);
		t.start();
	}

}
