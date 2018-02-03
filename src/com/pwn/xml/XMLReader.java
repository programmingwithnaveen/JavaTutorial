package com.pwn.xml;

import java.io.File;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlRootElement;

/*JAXB or Java Architecture for XML Binding (JAXB) allows read and write XML using Java.*/

public class XMLReader {

	/*
	 * user.xml <?xml version="1.0" encoding="UTF-8" standalone="yes"?> <user>
	 * <name>Johnny</name> <userID>12313</userID> </user>
	 */

	public static void main(String[] args) {
		try {
			User user = JAXB.unmarshal(
					new File("c://install/user.xml"), User.class);
			System.out.println("User Name " + user.getName());
			System.out.println("User ID " + user.getUserID());
		} catch (Exception e) {
			System.err.println(
					"Exception occurred while reading the XML!");
		}

	}

}

@XmlRootElement
class User {
	private long userID;
	private String name;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
