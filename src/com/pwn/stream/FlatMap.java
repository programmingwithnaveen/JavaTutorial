package com.pwn.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Flatten Streams with flatMap()*/
public class FlatMap {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("1", "2");
		List<String> list2 = Arrays.asList("3", "4", "5");
		List<String> list3 = Arrays.asList("6");
		List<String> finalList = Stream.of(list1, list2, list3)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(finalList);

	}

}
