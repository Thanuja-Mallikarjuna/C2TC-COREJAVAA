package com.cg.statickeywords;
class emplo{
	int rollno;
	String name;
	static String college="Siet";
	emplo(int r,String n){
		rollno=r;
		name=n;
		
	}
	static void change()
{
		college="sit";
		}
	void display() {
		System.out.println(rollno+ " "+name+ " "+college);
	}
}
public class Main {

	public static void main(String[] args) {
	 emplo e1=new emplo(111,"thanu");
	 emplo e2=new emplo(112,"pramodh");
	 e1.change();
	 e1.display();
	 e2.display();

	}

}
