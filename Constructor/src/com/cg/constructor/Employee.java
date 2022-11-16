package com.cg.constructor;

public class Employee {

	int id;
	String name;
	float salary;
	Employee(){
		System.out.println("user defined no arg constructor executed");
	}
	void display() {
		System.out.println(id+ " "+name+ " "+salary);
	}
}
