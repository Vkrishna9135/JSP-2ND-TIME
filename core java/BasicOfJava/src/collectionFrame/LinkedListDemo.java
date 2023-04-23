package collectionFrame;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("gayathri");
		l.add("siva");
		l.add(30);
		l.add(null);
		l.add("gayathri");
		l.set(0,"java developer");
		l.add(3,"Venkey");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Mech");
		System.out.println(l);
		}
}
