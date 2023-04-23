package com.fileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
public class ReadData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\file handling\\KRISHNA@JAVA PROGRAMING.txt");
		int ch=fis.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=fis.read();
		}
		fis.close();
	}
}
