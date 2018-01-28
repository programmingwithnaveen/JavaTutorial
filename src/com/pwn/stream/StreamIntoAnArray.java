package com.pwn.stream;

import java.util.Arrays;
import java.util.List;

public class StreamIntoAnArray {

	public static void main(String[] args) {
		List<String> fruitsList = Arrays.asList("apple", "banana", "Mango", "Grape", "orange");
		String[] fruitArray = fruitsList.stream()
						                .filter(s -> s.contains("a"))
						                .toArray(String[]::new);
		
		System.out.println(Arrays.toString(fruitArray));

	}

}
