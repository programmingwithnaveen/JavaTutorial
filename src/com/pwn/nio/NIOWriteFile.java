package com.pwn.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NIOWriteFile {

	public static void main(String[] args) {
		String filepath ="C:\\install\\instructions.txt";
		try (FileOutputStream fos = new FileOutputStream(filepath)){
		byte[] buffer = "This is sample Instructions File".getBytes();
		fos.write(buffer, 0, buffer.length);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
