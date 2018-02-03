package com.pwn.js;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExecuteJS {

	public static void main(String[] args) {
		// Obtain an instance of the JavaScript engine
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		/*
		 * hello.js source code var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
		 * 
		 * var evenNumbers = array.filter(function(i) { return i % 2 == 0; });
		 * print('Output from JS file ',evenNumbers);
		 */

		// Load and execute a script from the file 'hello.js'
		try {
			engine.eval(
					new FileReader(new File("c://install/hello.js")));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (ScriptException ex) {
			ex.printStackTrace();
		}

	}

}
