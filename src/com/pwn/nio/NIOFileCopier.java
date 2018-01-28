package com.pwn.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIOFileCopier {

	public static void main(String[] args) {
		File sourceFile = new File("c://install/instructions.txt");
		File destFile = new File("c://install/copy.txt");
		if (!sourceFile.exists() || !destFile.exists()) {
			System.out.println("Source or destination file doesn't exist");
			return;
		}
		try (FileChannel srcChannel = new FileInputStream(sourceFile).getChannel();
				FileChannel destChannel = new FileOutputStream(destFile).getChannel()) {
			srcChannel.transferTo(0, srcChannel.size(), destChannel);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
