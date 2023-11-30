package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer>list=new LinkedList<Integer>();
		list.add(12);
		list.add(37);
		list.add(90);

		list.add(88);
	    list.add(88);
		list.add(89);
		list.addFirst(77);
		list.addLast(55);
	System.out.println(list);
	list.removeFirst();
	list.removeLast();
	System.out.println(list);
	}

}
