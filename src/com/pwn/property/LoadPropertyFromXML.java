package com.pwn.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class LoadPropertyFromXML {

	public static void main(String[] args) {
		// make new properties instance to load the file into
		Properties prop = new Properties();
		// check to make sure the file exists
		File file = new File("c://install//userdetails.xml");
		if (file.exists()) {
			// load the file
			try {
				prop.loadFromXML(new FileInputStream(file));
			} catch (InvalidPropertiesFormatException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// print out all the properties
			for (String name : prop.stringPropertyNames()) {
				System.out
						.println(name + "=" + prop.getProperty(name));
			}
		} else {
			System.err.println("Error: No file found : ");
		}

	}

}
