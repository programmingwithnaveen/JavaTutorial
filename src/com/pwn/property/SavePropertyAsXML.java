package com.pwn.property;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SavePropertyAsXML {

	public static void main(String[] args) {
		// make new instance of properties
		Properties prop = new Properties();
		// set the property values
		prop.setProperty("name", "Naveen");
		prop.setProperty("country", "US");

		// check to see if the file already exists
		File file = new File("c://install//userdetails.xml");
		if (!file.exists()) {
			// save the properties
			try {
				file.createNewFile();
				prop.storeToXML(new FileOutputStream(file),
						"testing properties with xml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
