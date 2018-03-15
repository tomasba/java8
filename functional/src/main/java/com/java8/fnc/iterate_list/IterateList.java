package com.java8.fnc.iterate_list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("a", "b", "c");

		//#6
		list.forEach(System.out::println);
		
		//#5
		list.forEach(value -> System.out.println(value));
		
		//#4
		list.forEach((value) -> System.out.println(value));
		
		//#3
		list.forEach((String value) -> System.out.println(value));
		
		//#2
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String value) {
				System.out.println(value);
			}
		});
		
		//#1
		for (String value : list) {
			System.out.println(value);
		}
	}

}