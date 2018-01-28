package com.pwn.stream;

import java.util.Arrays;
import java.util.List;

/**
 * A Stream object's processing can be sequential or parallel.
 * In a sequential mode, the elements are processed in the order of the source of the Stream.
 * Parallel mode allows the use of multiple threads on multiple cores but there is no guarantee of the order in which
 * elements are processed.
 */
public class StreamProcessing {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5);
		System.out.println("***********Sequential Processing***********");
		
		integerList.stream()
					.filter(p -> (p % 2) == 0)
					.forEach(System.out::println);
		
		System.out.println("***********Parallel Processing***********");
		
		integerList.parallelStream()
					.filter(p -> (p % 2) == 0)
					.forEach(System.out::println);
	}

}
