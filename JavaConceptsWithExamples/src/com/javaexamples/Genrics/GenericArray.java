package com.javaexamples.Genrics;
import java.util.ArrayList;
import java.util.List;

public class GenericArray<T> {
	//Attribute
	private T t;
	
	//constructor
	public GenericArray(T t) {
		super();
		this.t = t;
	}
	//to string
	@Override
	public String toString() {
		return "GenericArray [t=" + t + "]";
	}

	public static void main(String[] args) {
		List<GenericArray<?>> list = new ArrayList<>();
		list.add(new GenericArray<>(1));  //Integer
		list.add(new GenericArray<>(true));  //boolean
		list.add(new GenericArray<>("Alok"));  //String
		list.add(new GenericArray<>(565655655656565665L));  //long
		list.add(new GenericArray<>(1.3f));  //float
		list.add(new GenericArray<>(52.66));  //Double
		list.add(new GenericArray<>("a"));  //char

		//For find any index value
//		System.out.println(list.get(0));
		
		// for print all value
		for(GenericArray<?> i:list) {
			System.out.println(i+" ");
		}
	}
}
