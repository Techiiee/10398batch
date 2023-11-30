package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(12);
		list.add(37);
		list.add(90);
		list.add(88);
        list.add(88);
		list.add(89);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
