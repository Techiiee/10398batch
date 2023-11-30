package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrdersMain {

	public static void main(String[] args) {
		Orders o1 = new Orders(1008, "chair", 34);
		Orders o2 = new Orders(1006, "Table", 44);
		Orders o3 = new Orders(1003, "kidschair", 74);
		HashMap<Integer, Orders> map = new HashMap<Integer, Orders>();
		map.put(o1.getOrderId(), o1);
		map.put(o2.getOrderId(), o2);
		map.put(o3.getOrderId(), o3);
		for (Map.Entry<Integer, Orders> m : map.entrySet()) {
			System.out.println(m);
		}
		System.out.println("sorting");
		TreeMap<Integer, Orders> map1 = new TreeMap<Integer, Orders>();
		map1.put(o1.getOrderId(), o1);
		map1.put(o2.getOrderId(), o2);
		map1.put(o3.getOrderId(), o3);
		for (Map.Entry<Integer, Orders> m : map1.entrySet()) {
			System.out.println(m);
		}
	}

}
