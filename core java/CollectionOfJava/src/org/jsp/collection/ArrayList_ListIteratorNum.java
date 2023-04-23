package org.jsp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ListIteratorNum {
	public static void main(String[] args) {
		ArrayList<Integer> ali=new ArrayList<Integer>();
		ali.add(45);
		ali.add(63);
		ali.add(99);
		ali.add(81);
		ali.add(36);
		ali.add(9);
		ali.add(18);
		ListIterator<Integer> liti=ali.listIterator(ali.size());
		while (liti.hasPrevious()) {
			int num=liti.previous();
			System.out.println(num);
		}
	}

}
