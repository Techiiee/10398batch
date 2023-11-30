package collections;

import java.util.TreeMap;

public class SortUsingMap {

	public static void main(String[] args) {
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "apple");
		map.put(2,"orange");
		map.put(2, "banana");
		map.put(3, "grapes");
		map.put(5, "orange");
		map.put(4, "dragon fruit");
		System.out.println(map);
	}

}
