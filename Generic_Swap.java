package com.rightstroke.java;

class generic<T>{
	T data1;
	T data2;
	T Swap;
	void data(T data1,T data2,T Swap) {
		this.data1=data1;
		this.data2=data2;
		this.Swap=Swap;
		System.out.println("Data before swapping: "+"d1"+" = "+this.data1+" d2"+"= "+this.data2);
		swap(this.data1,this.data2,this.Swap);
	}
	void swap(T d1,T d2,T s) {
		s=d1;
		d1=d2;
		d2=s;
		System.out.println("                                             ");
		System.out.println("Data After swapping: "+" d1"+" = "+d1+" d2"+" = "+d2);
	}
}
public class Generic_Swap {

	public static void main(String[] args) {
		generic<Integer> Gen1 = new generic<Integer>();
		Gen1.data(10, 20, null);
		System.out.println("--------------------------------------------");
		generic<String> Gen2 = new generic<String>();
		Gen2.data("Lakshmi","Gana",null);
	}

}
