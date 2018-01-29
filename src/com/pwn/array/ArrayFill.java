package com.pwn.array;

import java.util.Arrays;

/*Filling an array after initialization*/
public class ArrayFill {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		Arrays.fill(strArray, "abc");
		System.out.println(Arrays.toString(strArray));

	}

}
