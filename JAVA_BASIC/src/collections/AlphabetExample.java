package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AlphabetExample {

	public static void main(String[] args) {
//		HashMap<Character,String> map=new HashMap<Character,String>();
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter a alphabet");
//		Character ch=sc.next().charAt(0);
//		map.put('A', "Apple,Ant,Aeroplane");
//		map.put('B', "Ball,Bat,Banana");
//		map.put('C', "Cat,Coffe,Camel");
//		
//		if(ch =='A') {
//			System.out.println(map.get('A'));
//		}else if(ch == 'B') {
//			System.out.println(map.get('B'));
//		}else {
//			System.out.println(map.get('C'));
//		}
		
		 HashMap<Character,List<String>> map=new HashMap<Character,List<String>>();
	      System.out.println("enter the alphabets");
	      char alphabet =sc.next().charAt(0);
	      List <String>avalue=new ArrayList<String>();

	      switch(alphabet)
	      {
	          case 'A':
	              avalue.add("apple");
	              avalue.add("aeroplane");
	              avalue.add("ant");
	              map.put(alphabet, avalue); 
	              break;
	          case 'B':
	              avalue.add("banana");
	              avalue.add("ball");
	              avalue.add("bowl");
	              map.put(alphabet, avalue); 
	              break;
	          case 'C':
	              avalue.add("cat");
	              avalue.add("camel");
	              avalue.add("cow");
	              map.put(alphabet, avalue); 
	              break;
	      }
	      
	      System.out.println(map);
	    
	}

}
