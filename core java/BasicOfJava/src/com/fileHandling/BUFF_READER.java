package com.fileHandling;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BUFF_READER {
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("E:\\file handling\\krish.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
}
