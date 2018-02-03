
package com.pwn.stream;

import java.util.stream.Stream;

public class StreamToFilter {

	public static void main(String[] args) {
		Stream<String> fruitStream = Stream.of("apple", "Orange", "mango", "banana", "orange");
		fruitStream.filter(s -> s.contains("a"))
				   .map(String::toUpperCase)
				   .sorted()
				   .forEach(System.out::println);
	}

}
