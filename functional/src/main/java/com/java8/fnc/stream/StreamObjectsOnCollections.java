package com.java8.fnc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class StreamObjectsOnCollections {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("a", "b", "c");
		
		//#2
		// transform a list
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		//list.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		
		//#1
//		final List<String> upperList = new ArrayList<>();
//		list.forEach(value -> upperList.add(value.toUpperCase()));
//		System.out.println(upperList);
	}

}