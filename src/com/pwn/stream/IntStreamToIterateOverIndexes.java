package com.pwn.stream;

import java.util.stream.IntStream;

public class IntStreamToIterateOverIndexes {

	public static void main(String[] args) {
		String[] fruitList = { "Apple", "Banana", "Orange", "Kiwi",
				"Grape" };
		IntStream.range(0, fruitList.length).mapToObj(
				i -> String.format("%d) %s", i + 1, fruitList[i]))
				.forEach(System.out::println);

	}

}
