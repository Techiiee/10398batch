package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(3);
		list.add(90);
		list.add(80);
		System.out.println(list);
		list.set(2, 98);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.get(3));

		System.out.println("================== for  loop");
		 for(int i=0;i<list.size();i++)
	       {
	    	   System.out.println(list.get(i));
	       }
		System.out.println("================== for each loop");
	      
	      for(Integer i:list)
	      {
	    	  System.out.println(i);
	      }
	Iterator it=list.iterator();
	      while(it.hasNext())//boolean
	      {
	    	  System.out.println(it.next());//12,13,14,15,16
	      }
	}

}
