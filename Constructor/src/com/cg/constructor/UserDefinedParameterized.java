package com.cg.constructor;

public class UserDefinedParameterized {
	
	int id;
	String name;
	float salary;
	UserDefinedParameterized( int id,String name,float salary){
		System.out.println("user defined parametar constructor executed");
		
	}
	void display() {
		System.out.println(id+ " "+name+ " "+salary);
	}
	

}
