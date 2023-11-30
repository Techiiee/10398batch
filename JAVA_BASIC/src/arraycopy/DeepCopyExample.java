package arraycopy;

import java.util.Arrays;

public class DeepCopyExample {

	public static void main(String[] args) {
		 int a[]= {1,2,3,4};
			
			int b[]=a.clone();//copy the array
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));
			a[0]++;
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));

	}

}
