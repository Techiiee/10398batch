package array;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        System.out.println("enter the size");
	        int size=sc.nextInt();//5
	        int a[]=new int[size];
	        for(int i=0;i<a.length;i++)//0<4
	        {
	            a[i]=sc.nextInt();//a[0]=1 a[1]=2,a[2]=4,a[3]=7;
	        }
	          

	            int firstLargest = a[0]; // Initialize firstLargest and secondLargest
	            int secondLargest = a[1];

	           
	           // a[0]=1 a[1]=2,a[2]=4,a[3]=7;

	            for (int i = 0; i < a.length; i++)//0<4 1<4 2<4 3<4
	            {
	                if (a[i] > firstLargest) //first //1>1=f 
	                                         //second 2>1=true
	                                        //third 4>2=tr
	                                       //fourth 7>4=t
	                { 
	                    secondLargest = firstLargest;//sec=1 sec=2 sec=4
	                    firstLargest = a[i];//fir=2 fir=4 fir=7
	                } 
	                else if (a[i] > secondLargest && a[i] != firstLargest) 
	                    //first 1>3=f
	                {
	                    secondLargest = a[i];
	                }
	              
	            }

	            System.out.println("The second largest value in the array is: " + secondLargest);

	}

}
