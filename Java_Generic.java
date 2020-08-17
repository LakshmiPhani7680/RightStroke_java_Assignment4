package com.rightstroke.java;

class phani<T>{//Generic Class
	T data;
	phani(T data){//Generic Constructor
		this.data = data;
	}
	T getName(T data) {//Generic Method
		return this.data;
	}
	public void display() {
		System.out.println("Entered Data: "+getName(this.data));
		System.out.println("Retrun Type: "+this.data.getClass().getName());
	}
}
public class Java_Generic{
	public static void main(String a[]) {
		phani <Integer> G1 = new phani<Integer>(21);
		G1.display();
		phani <String> G2 = new phani<String>("Phani");
		G2.display();
		phani <String> G3 = new phani<String>("ID-42");
		G3.display();
	}
}
