package com.rightstroke.java;
import java.io.*;
import java.nio.file.Files;
public class File_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String myString = "I Love My India";
			FileOutputStream fos = new FileOutputStream("myFirstFile.txt");
			byte[] bytes = myString.getBytes();
			fos.write(bytes);
			fos.close();
			File main = new File("myFirstFile.txt");
			File copy = new File("copy.txt");
			Files.copy(main.toPath(), copy.toPath());
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
