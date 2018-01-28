package com.pwn.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOReadFileToByteArray {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\install\\instructions.txt");
		try {
			byte[] data = Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
