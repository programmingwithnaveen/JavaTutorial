package com.pwn.collection;

import java.util.Arrays;
import java.util.List;

public class CommaStringToList {

	public static void main(String[] args) {
		String city = "SFO,New York,Washington";

		/* Split string based on comma and convert to List using java.util.Arrays */
		List<String> cityList = Arrays.asList(city.split(","));

		System.out.println(cityList);
	}
}
