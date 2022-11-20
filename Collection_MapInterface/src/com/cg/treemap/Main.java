package com.cg.treemap;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;


public class Main {

	public static void main(String[] args) {
		SortedMap<Integer,String> s=new TreeMap<Integer,String>();
		  s.put(1, "thannu");
		  s.put(4,"pratun");
		  s.put(3, "pramodh");
		  //s.firstEntry(s);
		  System.out.println(s.subMap(1,5));
		  System.out.println(s.lastKey());
          System.out.println(s.firstKey());
          System.out.println(s.headMap(2));
          System.out.println(s.tailMap(2));
	}

}
