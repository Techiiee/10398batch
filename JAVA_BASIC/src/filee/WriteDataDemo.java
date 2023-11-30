package filee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
    File file1 = new File("C:\\Users\\Documents/Friends.txt");
    FileWriter fw = new FileWriter(file1);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Java Full Stack");
    bw.newLine();
    bw.write("Python Full Stack");
    bw.newLine();
    bw.flush();
    bw.close();
    System.out.println("File is Written");
	}

}
