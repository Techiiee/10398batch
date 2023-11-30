package NestedForLoop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int num=sc.nextInt();
        sc.close();
        
        int rev=0,rem; 
        
        for(;num!=0;) {
        	rem=num%10;
        	rev=rev*10 + rem;
        	num=num/10;
        }
        System.out.println(rev);
	}

}

//Scanner sc=new Scanner(System.in);
//System.out.println("enter the number");
//int n=sc.nextInt();//123
//int rev=0,digit=0;
//while(n!=0)//123!=0 12!=0 1!=0
//{
//	digit=n%10;//123%10=3 12%10=2 1%10=1
//	rev=rev*10+digit;//rev=0*10=0+3=3 rev=3*10=30+2=32 rev=32*10=320+1=321
//	n=n/10;//123/10=12 12/10=1 
//}
//System.out.println("The reverse =:"+rev);