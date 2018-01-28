package com.pwn.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*\Z is the EOF (End of File) Symbol. When set as delimiter the Scanner will read the fill until the EOF Flag is reached.
*/
public class ReadingFileAtOnce {

	public static void main(String[] args) {
		File f = new File("c://install//instructions.txt");
		try {
			String content = new Scanner(f).useDelimiter("\\Z").next();
			System.out.println(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
