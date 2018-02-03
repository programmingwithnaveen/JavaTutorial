package com.pwn.dateUtil;

import java.util.Calendar;
import java.util.Date;

public class FindingAMPM {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		if (cal.get(Calendar.AM_PM) == Calendar.PM)
		System.out.println("It is PM");
		else
			System.out.println("It is AM");	
	}

}
