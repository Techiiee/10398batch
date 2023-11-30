package variablesanddatatypes;

public class TypeCasting {

	public static void main(String[] args) {
		int i=90;//4 byte
		double j=i;//widening 
		System.out.println(i);
		System.out.println(j);
		
		float f=97.9f;
		double d=f;
		System.out.println(d);
		
		
		double c=998.90;//8 byte
		int x=(int)c;
		System.out.println(x);

	}

}
