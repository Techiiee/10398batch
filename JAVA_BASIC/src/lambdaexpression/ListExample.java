package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(12);
//		list.add(37);
//		list.add(90);
//		list.add(88);
//		list.add(88);
//		list.add(89);
		
		List<Integer> list= Arrays.asList(12,13,14,14,16,17);
		for(Integer i:list)
		{
			System.out.println(i);
		}
       System.out.println("lambada ");
		list.forEach(x -> System.out.println(x));
		
		System.out.println("multi line lambada ");

		list.forEach(x->{
		x=x+2;
		System.out.println(x);
		});
		
		//lambda expression with local variable
		list.forEach(x->{
			int y=x+2;
			System.out.println(y);
			});
	}

}
