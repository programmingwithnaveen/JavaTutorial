package com.pwn.collection;

import java.util.Iterator;

public class CustomIterable {

	public static void main(String[] args) {
		System.out.println("Alphabet List below ");
		for (char c : new Alphabet()) {
			System.out.println(c);
		}
	}
}

class Alphabet implements Iterable<Character> {
	@Override
	public Iterator<Character> iterator() {
		return new Iterator<Character>() {
			char letter = 'a';

			@Override
			public boolean hasNext() {
				return letter <= 'z';
			}

			@Override
			public Character next() {
				return letter++;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException(
						"Doesn't make sense to remove a letter");
			}
		};
	}
}