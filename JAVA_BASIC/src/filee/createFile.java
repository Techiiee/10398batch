package filee;

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) throws IOException {
		File f=new File("task.txt");
		if(f.exists())
		{
			System.out.println("already exists");
		}
		else
		{
			f.createNewFile();
			System.out.println("file created");
		}
	}

}
