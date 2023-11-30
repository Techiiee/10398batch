package twodimensionalarray;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		int row=sc.nextInt();//2
	    int col=sc.nextInt();	//2	
		int a[][]=new int[row][col];//00,01,10,11
		
		System.out.println("enter the elements");
	     for(int i=0;i<row;i++)//0<2 1<2
	     {
	    	 for(int j=0;j<col;j++)//0<2 1<2 2<2=f
	    		                  //0<2 1<2
	    	 {
	    		 a[i][j]=sc.nextInt();//00=12 01=13
	    		                      //10=14  11=15
	    	 }
	     }
		
	     for(int i=0;i<row;i++)
	     {
	    	 for(int j=0;j<col;j++)
	    	 {
	    		 System.out.print(a[i][j]);
	    	 }
	    	 System.out.println();
	     }

	}

}
