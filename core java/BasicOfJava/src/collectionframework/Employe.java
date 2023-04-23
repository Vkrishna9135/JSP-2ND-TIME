package collectionframework;
import java.io.*;
public class Employe {
	int id;
	String name;
	Employe(int i,String n){
		id=i;
		name=n;
	}
	void displayData() {
		System.out.println(id+"\t"+name);
	}
	

}
