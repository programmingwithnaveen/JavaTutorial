package com.pwn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratingCollections {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>(
				Arrays.asList("Apple", "Banana", "Grape"));
		System.out.println(
				"***************Iterate List***********************");
		fruitList.forEach(System.out::println);
		System.out.println(
				"***************Iterate Map***********************");
		Map<Integer, String> fruitMap = new HashMap<>();
		fruitMap.put(1, "Apple");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Grape");

		fruitMap.forEach((key, value) -> System.out
				.println("Key: " + key + " Value: " + value));

	}

}
