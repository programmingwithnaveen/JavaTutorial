package com.pwn.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOReadFile {

	public static void main(String[] args) {
		String file = "c://install//instructions.txt";
		try (Stream<String> stream = Files.lines(Paths.get(file))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
