package org.jsp.collection;
import java.util.*;
public class LinkedList_ForwordNUM {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(44);
		ll.add(55);
		ll.add(33);
		ll.add(22);
		ll.add(11);
		ll.add(99);
		ll.add(100);
//		Iterator<Integer> itr=ll.iterator();
//	 iterating in forword direction....
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//}
		
		ListIterator<Integer> litr=ll.listIterator(ll.size());
		while(litr.hasPrevious()) {
			int num=litr.previous();
			System.out.println(num);
		}
	}

}
