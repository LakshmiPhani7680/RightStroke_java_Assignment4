package com.rightstroke.java;
import java.util.*;
@SuppressWarnings("serial")
class UserDefinedException extends Exception{
	public UserDefinedException(String s) {
		super(s);
	}
}
public class UserException {
	void pay(int p) throws UserDefinedException{
		if ((p<10000) || (p>30000)) {
			throw new UserDefinedException("PayOutOfBoundsException");
		}
	}
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		UserException pay1 = new UserException();
		try 
		{
			int p = scan.nextInt();
			pay1.pay(p);
		}
		catch(UserDefinedException e) {
			System.out.println("Got the Exception");
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
