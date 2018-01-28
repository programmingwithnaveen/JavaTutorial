package com.pwn.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStream {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("San Francisco");
		data.add("New York");
		data.add("New York");
		data.add("Amsterdam");
		data.add("Mumbai");
		data.add("California");
		System.out.println(data);
		List<String> sortedList = data.stream()
									  .sorted()
									  .collect(Collectors.toList());
	
		System.out.println("Sorted List using stream sort() "+sortedList);
		
		List<String> sortedList2 = data.stream()
									   .sorted((s1,s2) ->s1.compareTo(s2))
									   .collect(Collectors.toList());
		System.out.println("Sorted List using compareTo() operator "+sortedList2);
		
		List<String> reverseSortedList =data.stream()
										    .sorted(Comparator.reverseOrder())
										    .collect(Collectors.toList());
		
		System.out.println("Reverse sort "+reverseSortedList);

	}

}
