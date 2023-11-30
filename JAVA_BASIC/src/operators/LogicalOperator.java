package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int x=9,y=10;
		boolean res=(x<y) && (x==y);// && its satisfy both condition
		boolean res1=(x<y) || (x==y);// || its satisfy any one condition
		boolean res2=(x!=y);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
