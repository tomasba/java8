package com.java8.fnc.transform_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TransformList {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("a", "b", "c");
		final List<String> upperList = new ArrayList<>();
		
		// limitation on parallelism as manually adding new objects to newly created list.
		list.forEach(value -> upperList.add(value.toUpperCase()));
		System.out.println(upperList);
	}

}