package lambdaexpression;

public class CubeMain {

	public static void main(String[] args) {
		Cube C=(c)->{
			return c*c*c;
		};
		System.out.println(C.cube(3));
	}

}
