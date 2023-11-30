package filee;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File newFile=new File("E:/friends.pdf");
		//File newFile =new File("ListofCources.txt");
		if(newFile.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File exists");
		}
		
		// System.out.println("Absolute Path"+newFile.getAbsolutePath());
		// System.out.println("Relative Path"+newFile.getCanonicalPath());
		     String [] list=newFile.list();
		     System.out.println("List of Files : "+list.length);

	}

}
