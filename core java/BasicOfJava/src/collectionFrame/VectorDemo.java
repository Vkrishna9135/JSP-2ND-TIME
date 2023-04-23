package collectionFrame;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=100;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.add("a");
		System.out.println(v.capacity());
		System.out.println(v);
	}
}
