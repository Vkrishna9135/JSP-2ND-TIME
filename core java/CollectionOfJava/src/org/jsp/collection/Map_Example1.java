package org.jsp.collection;
import java.util.*;
public class Map_Example1 {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1,"krishna");
		m.put(3,"vijay");
		m.put(5,"ramana");
		m.put(8,"mahish");
		m.put(9,"gangadhar");
		m.put(7,"malya");
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			 Map.Entry entry=(Map.Entry)itr.next();  
			  System.out.println(entry.getKey()+" "+entry.getValue());  
		}
		
	}

}
