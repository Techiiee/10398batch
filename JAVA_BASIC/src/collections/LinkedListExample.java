package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(12);
		list.add(37);
		list.add(90);

		list.add(88);
        list.add(88);
		list.add(89);
		System.out.println(list);
		list.set(2, 98);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.get(3));
		list.addFirst(45);

		list.addLast(22);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}

}
