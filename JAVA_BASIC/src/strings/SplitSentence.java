package strings;

import java.util.Scanner;

public class SplitSentence {

	public static void main(String[] args) {
		// input: java is object oriented
		//output: java
//		          is
//		          Object
//		          oriented
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		 String word[]=sentence.split(" ");
		 for(String temp:word)//for each loop
		 {
			 System.out.println(temp);
		
		 }
	}

}
