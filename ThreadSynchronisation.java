package com.rightstroke.java;

class Synchronisation{
	synchronized void table(int num) {
		for(int i = 1 ; i<=5;i++) {
			System.out.println(num+"*"+i+"="+num*i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	Synchronisation t1;  
	Thread1(Synchronisation t1){  
	this.t1=t1;  
	}  
	public void run(){  
	t1.table(2);
	}
}
class Thread2 extends Thread{
	Synchronisation t2;
	Thread2(Synchronisation t2){
		this.t2 = t2;
	}public void run() {
		t2.table(3);
	}
}
public class ThreadSynchronization { 
	public static void main(String args[]) {
		Synchronisation table = new Synchronisation();
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		t1.start();
		t2.start();
	}
}
