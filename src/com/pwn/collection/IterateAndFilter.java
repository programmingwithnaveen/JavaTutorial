package com.pwn.collection;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class IterateAndFilter {

	public static void main(String[] args) {
		Path dir = Paths.get("C:\\Users\\naveen.kn\\Downloads");
		PathMatcher imageFileMatcher =
		FileSystems.getDefault().getPathMatcher(
		"regex:.*(?i:jpg|jpeg|png|gif|bmp|jpe|jfif|pdf)");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir,
		entry -> imageFileMatcher.matches(entry.getFileName()))) {
		for (Path path : stream) {
		System.out.println(path.getFileName());
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
