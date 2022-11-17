package com.cg.multithreading;

public class ImplementeThread {
	class eclips implements Runnable
	{
		public void run() {
			System.out.println("eclips thread is"+Thread.currentThread().getId());
		}
	}
	class PPt implements  Runnable{
		public void run() {
			System.out.println("PPt thread is"+Thread.currentThread().getId());
		}
	}

	public static void main(String[] args) {
		eclips e=new eclips();
		Thread t=new Thread(e);
		PPt p=new PPt();
		Thread t1=new Thread(p);
		t1.start();
		

	}

}
