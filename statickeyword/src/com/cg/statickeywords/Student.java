package com.cg.statickeywords;


class method{
	int rollno;
	String name;
	static String college="SIET";
	method( int r,String n){
		rollno=r;
		name=n;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
}

public class Student {

	public static void main(String[] args) {
method m1=new method(11,"thanu");
method m2=new method(50,"pramodh");
m1.display();
m2.display();

	}

}
