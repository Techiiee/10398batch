package threads;

public class PriorityExample extends Thread{
	
	public static void main(String[] args) {
		PriorityExample p=new PriorityExample();
		p.setPriority(10);
		System.out.println(p.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(p.MAX_PRIORITY);
		System.out.println(p.MIN_PRIORITY);
	}

}
