package com.java8.fnc.find_in_collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindInCollections {

	public static void main(String[] args) {
		
		MyDto dto1 = new MyDto(1, "aaabbb");
		MyDto dto2 = new MyDto(2, "ccddffgg");
		MyDto dto3 = new MyDto(3, "ggeerrtt");
		final List<MyDto> dtoList = Arrays.asList(dto1, dto2, dto3);
		dtoList.stream().filter(d -> "aaabbb".equals(d.getValue())).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		final List<String> list = Arrays.asList("a", "za", "b", "az", "c");				
		
		//#4
		final Predicate<String> startingWithA = val -> val.startsWith("a");
		final List<String> list3 = 
				list.stream().
					filter(startingWithA).
						collect(Collectors.toList());
		list3.forEach(System.out::println);
		
		//#3
		final List<String> list2 = 
				list.stream().
					filter(name -> name.startsWith("a")).
						collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		//#2
		list.stream().filter(name -> name.startsWith("a")).forEach(System.out::println);
		
		//#1
		list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String value) {
				if (value.startsWith("a")) {
					return true;
				}
				return false;
			}
			
		}).forEach(System.out::println);
	}

}