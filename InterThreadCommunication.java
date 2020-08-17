package com.rightstroke.java;

public class InterThreadCommunication {
	int amount = 5000;
	
	synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Amount is less waiting to deposit");
			try {
				wait();
			}catch(Exception e) {
			}
		}
			this.amount -= amount;
			System.out.println("Withdraw Completed");
			}
	synchronized void deposit(int amount) {
		System.out.println("In Deposit");
		this.amount+=amount;
		System.out.println("Deposit completed");
		notify();
	}
}
class Customer{
	public static void main(String a[]) {
		final InterThreadCommunication c=new InterThreadCommunication();  
		new Thread(){  
		public void run(){c.withdraw(15000);}  
		}.start();  
		new Thread(){  
		public void run(){c.deposit(100000);}  
		}.start();  
	}
}
