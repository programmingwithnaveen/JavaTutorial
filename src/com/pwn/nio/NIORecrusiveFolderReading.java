package com.pwn.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class NIORecrusiveFolderReading {
	public static void main(String args[]) {
		
		Path dirPath = new File("C://install").toPath();

		try {
			Files.walkFileTree(dirPath, EnumSet.noneOf(FileVisitOption.class), 1, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path selectedPath, BasicFileAttributes attrs) throws IOException {
					System.out.println("d " + selectedPath.toAbsolutePath());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path selectedPath, BasicFileAttributes attrs) throws IOException {
					System.out.println("f " + selectedPath.toAbsolutePath());
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
