package com.cg.lambda;

@FunctionalInterface
interface inter{
	void show();
}
  /*class b implements nf{
	   public void show() {
		   System.out.println("hi");
		  
	  }
  }*/

public class LambdaFristEg {

	public static void main(String[] args) {
		//Anonymous inner class class
		/*inter i=new inter() {
			public void show()
			{
				System.out.println("hello");
			}
		};*/
		
		inter i=() ->{
			System.out.println("welcome");
			
		};
		i.show();
		
	}
	
}