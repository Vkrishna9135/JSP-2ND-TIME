package com.fileHandling;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\file handling\\krish.txt",true);
			fos.write(65);
			fos.write(80);
			fos.write(80);
			fos.write(76);
			fos.write(69);
			fos.flush();
			fos.close();
			
	}

}
