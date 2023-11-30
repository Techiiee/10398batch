package streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateRandomNum {

	public static void main(String[] args) {
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

		
		Random r = new Random();
		for (int i = 0; i <= 20; i++) {
			float x = r.nextFloat(100);
			System.out.println(x);
		}
	}

}
