package com.cg.lambda;

@FunctionalInterface
interface Bike{
	//without public we can use because in interface by default methods are public
	void run(int i,String s);
	
}

public class LambdaWithParameter {

	public static void main(String[] args) {
		Bike b= (i,s) ->{
			System.out.println("Bike running safely at"+" "+i+"km and driver is"+" "+s);
		};
		b.run(10,"Thanu");

	}

}
