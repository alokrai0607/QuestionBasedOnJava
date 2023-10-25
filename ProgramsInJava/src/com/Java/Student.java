package com.Java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	transient int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi", 22);
		FileOutputStream f = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		System.out.println(s1);
	}
}
