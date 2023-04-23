package org.jsp.collection;
import java.util.*;
public class ArrayList_ListIterator {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("usa");
		al.add("india");
		al.add("nepal");
		al.add("china");
		al.add("russia");
		al.add(null);
		al.add("india");
		ListIterator<String> litr=al.listIterator(al.size());
		while(litr.hasPrevious()) {
			String str=litr.previous();
			System.out.println(str);
		}
	}

}
