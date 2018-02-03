package com.pwn.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileAtOnce {

	public static void main(String[] args) {
		File f = new File("c://install//instructions.txt");
		try (Scanner scanner = new Scanner(f)){
			String content=scanner.useDelimiter("\\Z").next();
			System.out.println(content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
