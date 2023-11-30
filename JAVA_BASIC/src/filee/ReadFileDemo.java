package filee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		try
		{
		File f = new File("C:\\Users\\Documents/Friends.txt");
	    FileReader fr = new FileReader(f);
	    BufferedReader br = new BufferedReader(fr);
	    String line =br.readLine();
	    while(line!=null) {
	    	System.out.println(line);
	    line=br.readLine();
	    }
		}
		 catch(IOException e)
	    {
	    	e.printStackTrace();
	}

}
	}