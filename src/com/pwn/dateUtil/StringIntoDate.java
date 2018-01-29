package com.pwn.dateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/*parse() from SimpleDateFormat class helps to convert a String pattern into a Date object.*/
public class StringIntoDate {

	public static void main(String[] args) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String dateStr = "01/28/2018"; // input String
		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		System.out.println(date.getDate()); // 116

	}

}
