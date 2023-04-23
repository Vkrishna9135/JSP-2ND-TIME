package com.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.*;

public class Write_pw {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\file handling\\krish.txt",true);
		PrintWriter pw=new PrintWriter(fos);
		pw.println("hai ! i m krishna ");
		pw.println(" i m from tadipatri ");
		pw.print("i was studied in tirupathi");
		pw.print("Thank you");
		pw.flush();
		pw.close();
	}
}
