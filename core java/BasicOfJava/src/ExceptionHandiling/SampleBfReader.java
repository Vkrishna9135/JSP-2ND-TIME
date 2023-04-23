package ExceptionHandiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleBfReader {
	private String name;
	void accept()throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name: ");
		name=br.readLine();
	}
	void display() {
		System.out.println("Name ="+name);
	}
	public static void main(String[] args)throws IOException
	{
		SampleBfReader sr=new SampleBfReader();
		sr.accept();
		sr.display();
	}
		
	}

