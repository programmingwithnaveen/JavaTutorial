package com.pwn.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadingProperty {
	
	/*user.properties
	name=Naveen
	country=US*/

	public static void main(String[] args) {
		try (InputStream bundledResource = LoadingProperty.class
				.getResourceAsStream("user.properties")) {
			Properties userProperties = new Properties();
			userProperties.load(bundledResource);
			System.out.println("username from property file "
					+ userProperties.get("name"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
