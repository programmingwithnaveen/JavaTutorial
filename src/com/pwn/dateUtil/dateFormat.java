package com.pwn.dateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy"); 
		System.out.println(dateFormat.format(today)); 
		
		dateFormat.applyPattern("dd-MM-yyyy");
		System.out.println(dateFormat.format(today)); 
		dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
		System.out.println(dateFormat.format(today)); 

	}

}
