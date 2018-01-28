package com.pwn.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayToList {
	

	public static void main(String[] args) {
	
		int[] ints = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = IntStream.of(ints).boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}
