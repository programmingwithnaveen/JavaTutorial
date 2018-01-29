package com.pwn.optional;

import java.util.Optional;

/*Optional is a container object which may or may not contain a non-null value. If a value is present, isPresent() will
return true and get() will return the value.
Additional methods that depend on the presence of the contained value are provided, such as orElse(), which
returns a default value if value not present, and ifPresent() which executes a block of code if the value is present.*/

public class OptionalUsage {

	public static void main(String[] args) {
		String value = null;
		/*Optional avoids usage of null check and NullPointerException*/ 
		/*Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.*/
		System.out.println(Optional.ofNullable(value).map(String::toUpperCase).orElse("INPUT ASSIGNED TO NULL")); // output is "INPUT ASSIGNED TO NULL"
		 
		 value = "Java";
		 System.out.println( Optional.ofNullable(value).map(String::toUpperCase).orElse("INPUT ASSIGNED TO NULL")); // output is "SOMETHING"
		
		 value = "JavaTest";
		 Optional.ofNullable(value) // JavaTest
		 .filter(x -> x.equals("JavaTest"))// this is run and passes
		 .isPresent(); // true

	}

}
