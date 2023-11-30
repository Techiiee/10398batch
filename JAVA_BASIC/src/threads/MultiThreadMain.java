package threads;

public class MultiThreadMain {

	public static void main(String[] args) {
		   Table t=new Table();
		   FirstThread f=new FirstThread(t);
		   f.start();
		   SecondThread s=new SecondThread(t);
		   s.start();
	}

}
