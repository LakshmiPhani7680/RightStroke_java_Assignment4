package com.rightstroke.java;

public class Auto_UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Autoboxing
		int num1=1;//Primitive data type
		Integer num2=num1;//Box data type
		System.out.println("Autoboxing: "+Integer.valueOf(num1));
		//----------------------------------------------------------
		//Unboxing
		Integer num3 = 6;//Box data type
		int num4 = num3;//Primitive data type
		System.out.println("Unboxing: "+num3.intValue());
	}

}
