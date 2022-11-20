package com.cg.mapintaerface;
import java.util.Map;
import java.util.HashMap;

public class PutAll {

	public static void main(String[] args) {
		Map<Integer,String> s=new HashMap<Integer,String>();
		    s.put(1, "Thanu");
		    s.put(2,"pramodh");
		    s.put(3,"Pratun");
	    Map<Integer,String> s1=new HashMap();
	      s1.putAll(s);
	      //.remove(2);
	      
	  
	      System.out.println(s1.keySet());
	      System.out.println(s1.entrySet());
	      System.out.println(s1.containsKey(3));
	}

}
