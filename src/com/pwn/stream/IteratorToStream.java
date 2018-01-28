package com.pwn.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStream {
//Use Spliterators.spliterator() or Spliterators.spliteratorUnknownSize() to convert an iterator to a stream:
	public static void main(String[] args) {
		
		Iterator<String> iterator = Arrays.asList("A", "B", "C").iterator();
		Spliterator<String> spliterator = Spliterators.spliteratorUnknownSize(iterator, 0);
		Stream<String> stream = StreamSupport.stream(spliterator, false);
		stream.forEach(System.out::println);

	}
}
