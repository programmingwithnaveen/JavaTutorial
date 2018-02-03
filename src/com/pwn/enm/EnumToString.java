package com.pwn.enm;

public class EnumToString {
	
	enum DAYS {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY;
		}

	public static void main(String[] args) {
		/*name() is an internal method in enum that returns the String representation of the enum,
		 *  the return String represents exactly how the enum value was defined.*/
		System.out.println(DAYS.SUNDAY.name());
		
		/*or Use toString() method */
		System.out.println(DAYS.FRIDAY.toString());
		
	}
}
