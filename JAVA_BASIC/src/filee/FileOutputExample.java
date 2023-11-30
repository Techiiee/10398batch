package filee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("new.txt");
		String s="hello";
		byte[] b=s.getBytes();
		
      fout.write(b);
      fout.close();
      System.out.println("write success");
	}

}
