package demo;

public class Max {
//	WAP to create array code check the max element in array and add the test case?
	public static int max(int[] j) {
		int[] arr= {1,3,4,5};
		int max=0;
//		int j=0;
		for(int i=0;i<=3;i++) {
			 if (arr[i] > max) {
	                max = arr[i];
			 }
		}
		 return max;
	}

}
