package com.pwn.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOReadFile {

	public static void main(String[] args) {
		String file = "c://install//instructions.txt";

		/*read files using try-with-resources
		 * Docs - https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		 * The try-with-resources statement is a try statement that declares one or more resources. 
		 * A resource is an object that must be closed after the program is finished with it.
		 *  The try-with-resources statement ensures that each resource is closed at the end of the statement. 
		 *  Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
		 * */
		try (Stream<String> stream = Files.lines(Paths.get(file))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
