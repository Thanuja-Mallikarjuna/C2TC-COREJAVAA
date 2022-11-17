package com.cg.multithreading;
class eclips extends Thread
{
	public void run() {
		System.out.println("eclips thread is"+Thread.currentThread().getId());
	}
}
class PPt extends Thread{
	public void run() {
		System.out.println("PPt thread is"+Thread.currentThread().getId());
	}
}
public class MultiThread {
	public static void main(String[] args) {
		eclips  h=new eclips();
		h.run();
		PPt p=new PPt();
		p.run();

	}


}
