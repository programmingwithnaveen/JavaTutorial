package com.pwn.stream;

import java.util.stream.IntStream;


/**
 *  It is possible to generate a Stream that does not end. Calling a terminal method on an infinite Stream causes the
Stream to enter an infinite loop. The limit method of a Stream can be used to limit the number of terms of the
Stream that Java processes.
This example generates a Stream of all natural numbers, starting with the number 1. Each successive term of the
Stream is one higher than the previous. By calling the limit method of this Stream, only the first five terms of the
Stream are considered and printed.
 *
 */
public class InfiniteStreams {
	public static void main(String[] args) {
		// Generate infinite stream - 1, 2, 3, 4, 5, 6, 7, ...
		IntStream naturalNumbers = IntStream.iterate(1, x -> x + 1);
		// Print out only the first 5 terms
		naturalNumbers.limit(5).forEach(System.out::println);
	}

}
