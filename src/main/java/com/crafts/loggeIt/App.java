package com.crafts.loggeIt;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Hello World");
		System.out.println("Hello World!");
	}
}
