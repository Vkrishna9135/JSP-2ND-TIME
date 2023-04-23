package collectionFrame;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("krishna");
		al.add(9194);
		al.add("krishna");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"chanu");
		al.add('n');
		al.add(6465);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
	}
}
