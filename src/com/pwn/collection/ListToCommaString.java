package com.pwn.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToCommaString {

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Washington", "New York", "SFO");
		
		/*Convert Arrays into String using java.util.stream.Collectors.joining method*/
		String city = cityList.stream().collect(Collectors.joining(","));
		
		System.out.println(city);

	}

}
