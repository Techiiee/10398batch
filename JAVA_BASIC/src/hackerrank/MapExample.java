package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class MapExample {

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("number");
		int n=in.nextInt();
//		in.nextLine();
        HashMap<String,Integer> phoneBook=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("name");
			String name=in.nextLine();
			int phone=in.nextInt();
//			in.nextLine();
            phoneBook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
            
		}
        in.close();
	}
}