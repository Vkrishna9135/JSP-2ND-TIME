package com.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Write_pw01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\file handling\\krish.txt");
		PrintWriter pw=new PrintWriter(fos);
		pw.println("hai ! i m krishna ");
		pw.println(" i m from tadipatri ");
		pw.print("i was studied in tirupathi");
		pw.print("Thank you");
		pw.flush();
		pw.close();
	}
}
