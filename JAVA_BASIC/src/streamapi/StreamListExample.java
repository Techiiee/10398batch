package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("=================================");
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}
}
