package filee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessingDemo {
 public static void main(String[] args) {
	int lines, words, chars;
	lines = words = chars = 0;
	
	File f = new File("C:\\Users\\Documents/Friends.txt");
	try(
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
	) {
		String line = br.readLine();
		while(line != null) {
			String[] tokens = line.split(" ");
			for(String eachWord : tokens){
				char[] c = eachWord.toCharArray();
				chars += c.length;					
				words++;
			}
			
			lines++;
			line = br.readLine();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Lines: "+lines);
	System.out.println("Words: "+words);
	System.out.println("Chars: "+chars);
	}
}
