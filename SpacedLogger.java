package com.promineotech;

import java.util.Date;

public class SpacedLogger implements Logger {


	@Override
	public void log(String log) {
		Date date = new Date();
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			if (i > 0) {
				spaces.append(" ");
			}
			spaces.append(log.charAt(i));
		}
		System.out.println(date.toString() + " " + spaces.toString());
	}

	@Override
	public void error(String errorLog) {
		Date date = new Date();
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < errorLog.length(); i++) {
			if (i > 0) {
				spaces.append(" ");
			}
			spaces.append(errorLog.charAt(i));
		}
		System.out.println(date.toString() + " " + spaces.toString());
		
	}

}
