package com.pwn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RmvItemFrmCollectoin {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("San Francisco");
		cities.add("New York");
		cities.add("San Diego");
		System.out.println("Before deleting List " + cities);
		Iterator<String> citiesIterator = cities.iterator();
		while (citiesIterator.hasNext()) {
			String city = citiesIterator.next();

			if ("San Diego".equals(city)) {
				citiesIterator.remove();
			}
		}

		System.out.println("After deleting List " + cities);
		cities = new ArrayList<String>();
		cities.add("San Francisco");
		cities.add("New York");
		cities.add("San Diego");

		cities.removeIf(p -> "San Diego".equals(p));

		System.out.println("After deleting List " + cities);

	}

}
