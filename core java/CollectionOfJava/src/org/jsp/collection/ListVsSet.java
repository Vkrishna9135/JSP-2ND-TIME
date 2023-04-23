package org.jsp.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListVsSet {
	public static void main(String[] args) {
		List<String> lst=new LinkedList<String>();
		lst.add("pink");
		lst.add("red");
		lst.add("orange");
		lst.add(null);
		lst.add("green");
		lst.add("orange");
		lst.add("brown");
		System.out.println(" list :"+lst);
		Set<String> st=new HashSet<String>();
		st.add("pink");
		st.add("red");
		st.add(null);
		st.add("orange");
		st.add("green");
		st.add("orange");
		st.add("brown");
		System.out.println();
		System.out.println(" set :"+st);
	}

}
