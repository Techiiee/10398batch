package threads;

class Task extends Thread{
	
	public void run() {
		for(int i =0; i<=5;i++) {
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		System.out.println("Hello");
		
	}
}
}
class Task2 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("How are you");
		
	}
}
}
public class Demo {

	public static void main(String[] args) {
		Task t = new Task();
		t.start();
		Task2 t2 = new Task2();
		t2.start();
		// TODO Auto-generated method stub

	}
}
