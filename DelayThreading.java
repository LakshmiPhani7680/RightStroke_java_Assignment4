package com.rightstroke.java;

public class DelayThreading implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Thread T1 = new Thread (new DelayThreading());
		Thread T2 = new Thread (new DelayThreading());
		T1.start();
		Thread.sleep(500);
		T2.start();
	}
	@Override
	public  void run() {
		System.out.println("My Thread is running with half Second delay");
	}
}
