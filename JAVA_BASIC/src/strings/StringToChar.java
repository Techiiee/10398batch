package strings;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		String s;
		//string to character conversion
	    char a[]=s.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	    
	    
	    String data = "JAVA";
	    char[] dest=new char[4];
	    data.getChars(0,4,dest,0);//start,endposition,char array variable na,e
	    //start pos
	    System.out.println(Arrays.toString(dest));
        System.out.println(s==s1);//check the memory
	    String data1 = "Personality";
	    //string to character conversion
	    char a[]=data.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	    
	    char[] dest1=new char[6];
	    data.getChars(3,9,dest,0);//start,endposition,char array variable na,e
	    //start pos
	    System.out.println(Arrays.toString(dest));

	}

}
