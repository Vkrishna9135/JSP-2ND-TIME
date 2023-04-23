package collectionFrame;
import java.util.*;
public class LinkedListDemo_2 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("bala krish");
		l.add("venkey");
		l.add("rajkumar");
		l.add("nag arjuna");
		System.out.println(l);
		ListIterator ltr=l.listIterator();	
		while(ltr.hasNext()) {
			String s=(String)ltr.next();
			if(s.equals("venkey"))
				ltr.remove();
			else if(s.equals("nag arjuna"))
				ltr.add("chiru");
			else if(s.equals("bala krish"))
				ltr.set("krishna");
			System.out.println(l);
		}
	}
}
