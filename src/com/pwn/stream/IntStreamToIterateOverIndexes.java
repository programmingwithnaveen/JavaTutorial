package com.pwn.stream;

import java.util.stream.IntStream;
//Streams of elements usually do not allow access to the index value of the current item. To iterate over an array or
//ArrayList while having access to indexes, use IntStream.range(start, endExclusive).
public class IntStreamToIterateOverIndexes {

	public static void main(String[] args) {
		String[] fruitList = { "Apple", "Banana", "Orange", "Kiwi", "Grape" };
		IntStream.range(0, fruitList.length)
		         .mapToObj(i -> String.format("%d) %s", i + 1, fruitList[i]))
		         .forEach(System.out::println);

	}

}
