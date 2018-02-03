package com.pwn.array;

import java.util.Arrays;

/* setAll can be used to set every element of an array to generated values. 
 * These methods are passed a generator function which accepts an index 
 * and returns the desired value for that position.*/

public class ArryFillUsingIndx {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		Arrays.setAll(intArray, i -> i + 1);
		System.out.println(Arrays.toString(intArray));

	}

}
