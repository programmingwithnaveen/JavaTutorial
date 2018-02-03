package com.pwn.stream;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyMap {

	public static void main(String[] args) {
		Stream.of("apple", "orange", "banana", "apple", "mango",
				"kiwi", "mango", "apple")
				.collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()))
				.entrySet().forEach(System.out::println);

	}

}
