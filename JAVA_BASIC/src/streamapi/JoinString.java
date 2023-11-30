package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinString {
	public static void main(String[] args) {
		List<String> alphabets = Arrays.asList("A","B","C");
		//list 2
		List<String> names = Arrays.asList("Sansa","Jon","Arya");
			
		//creating two streams from the two lists and concatenating them into one
		Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
		opstream.forEach(str->System.out.print(str+" "));
	}
}
