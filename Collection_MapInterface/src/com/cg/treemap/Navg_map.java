package com.cg.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.NavigableMap;

public class Navg_map {

	public static void main(String[] args) {
		NavigableMap<Integer, String> s = new TreeMap<Integer, String>();
		s.put(1, "Thanu");
		s.put(2, "pramodh");
		s.put(3, "Pratun");
		// System.out.println(s.firstEntry());
		// System.out.println(s.lastEntry());
		//System.out.println(s.pollFirstEntry());
		//System.out.println(s.pollLastEntry());
		System.out.println(s.descendingMap());
		System.out.println(s.descendingKeySet());

	}

}
