package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AlphabetUsingDoWhile {

	    public static void main(String[] args) 
	    {
	          HashMap<Character,List<String>>map=new HashMap<Character,List<String>>();
	            String s;

	        do
	        {
	          Scanner sc=new Scanner(System.in);

	        
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
	              System.out.println(map);

	              break;
	          case 'B':
	              avalue.add("banana");
	              avalue.add("ball");
	              avalue.add("bowl");
	              map.put(alphabet, avalue); 
	              System.out.println(map);

	              break;
	          case 'C':
	              avalue.add("cat");
	              avalue.add("camel");
	              avalue.add("cow");
	              map.put(alphabet, avalue); 
	              System.out.println(map);

	              break;
	      }
	      
//	      for(Map.Entry<Character, List<String>> m:map.entrySet())
//	        {
//	            System.out.println(m.getKey());
//	            System.out.println(m.getValue());
//	        }
	      System.out.println("do u want to continue");
	      s=sc.next();
	        }
	        while(s.equals("yes"));
	      
	    }

	}