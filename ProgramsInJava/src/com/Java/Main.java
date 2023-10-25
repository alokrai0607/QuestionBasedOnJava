package com.Java;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("\"D:\\img.jpg\"");
		FileOutputStream fos = new FileOutputStream("\"D:\\img1.png\"");
		int i = fis.read();
		while (i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("success.......");
	}
}