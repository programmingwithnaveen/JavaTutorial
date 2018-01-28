package com.pwn.stream;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * The groupingBy(classifier, downstream) collector allows the collection of Stream elements into a Map by
 * classifying each element in a group and performing a downstream operation on the elements classified in the same
 * group. 
 *
 **/

public class FrequencyMap {

	public static void main(String[] args) {
		Stream.of("apple", "orange", "banana", "apple","mango","kiwi","mango","apple")
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.forEach(System.out::println);

	}

}
