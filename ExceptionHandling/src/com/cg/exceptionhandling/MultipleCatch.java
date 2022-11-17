package com.cg.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try{

			int arr[]=new int[5];

			arr[7]=100/20;

			}

			catch(ArithmeticException e)

			{

			System.out.println("Arithmetic Exception occurs");

			}

			catch(ArrayIndexOutOfBoundsException e)

			{

			System.out.println("ArrayIndexOutOfBounds Exception occurs");

			}

			
			System.out.println("rest of the code");

	}

}
