package com.rightstroke.java;
import java.io.*;
import java.util.*;
public class File_Handling_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "I Love Indian Army";
			FileOutputStream Fos = new FileOutputStream("Vowels.txt");
			byte[] bytes = data.getBytes();
			Fos.write(bytes);
			Fos.close();
			FileInputStream Fis = new FileInputStream("Vowels.txt");
			int read;
			ArrayList <Character> Char = new ArrayList<Character>();
			int count = 0;
			while((read = Fis.read())!=-1) {
				char rea = (char)read;
				Character r = rea;
				r=Character.toLowerCase(r);
				if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u') {
					System.out.println("The Vowels in the Sentence Are: "+r);
					count++;
				}
			}
			System.out.println("The no.of Vowels in the given sentence are: "+count);
		}catch(IOException ex) {
			System.out.println(ex);
		}

	}

}
