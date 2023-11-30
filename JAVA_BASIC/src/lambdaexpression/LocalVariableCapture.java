package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LocalVariableCapture {
    private static int var=10;
	public static void main(String[] args) {
		List<Integer> intSeq=Arrays.asList(1,2,3);
		int var=10;
		intSeq.forEach(x->System.out.println(x+var));
	}

}
