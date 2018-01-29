package com.pwn.xml;

import java.io.File;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlRootElement;

public class XMLWriter {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Johnny");
		user.setUserID(12313);
		try {
		JAXB.marshal(user, new File("C://install//userDetail.xml"));
		} catch (Exception e) {
		System.err.println("Exception occurred while writing in XML!");
		} finally {
		System.out.println("XML created");
		}

	}

}


