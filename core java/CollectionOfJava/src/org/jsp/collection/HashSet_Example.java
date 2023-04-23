package org.jsp.collection;
import java.util.*;
public class HashSet_Example {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("vamsi");
		hs.add("vijay");
		hs.add("pavan");
		hs.add("murali");
		hs.add("murali");
		hs.add("murali");
		hs.add("rahul");
		hs.add("kumar");
		hs.add("sreekar");
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("pullaiyya");
		hs1.add("hussin");
		hs1.addAll(hs);
		System.out.println(hs1);
		hs1.remove("pullaiya");
		System.out.println(hs1);
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
