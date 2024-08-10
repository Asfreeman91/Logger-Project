package com.promineotech;

import java.util.Date;

public class AsteriskLogger implements Logger {

	
	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + " : " + "***" + log + "***");
	}

	@Override
	public void error(String errorLog) {
		Date date = new Date();
		String preAsterisks = " ***";
		String postAsterisks = "*** ";
		String errorMessage = date.toString() + " " + "ERROR: " + errorLog;
		int width = preAsterisks.length() + errorMessage.length() + postAsterisks.length();
		int height = 3;
		
		boolean isErrorLogPrinted = false;
		for (int row = 0; row < height; row++) {
			for (int column = 1; column <= width; column++) {
				if (row == 0 || row == (height - 1)) {
					System.out.print("*");
				} else {
					if (column == 1 ) {
						System.out.print(preAsterisks);
					} else if (column == width) {
						System.out.print(postAsterisks);
					} else {
						if (!isErrorLogPrinted) {
							System.out.print(errorMessage);
							isErrorLogPrinted = true;
						}
					}
				}
			}
			System.out.println();
		}
		
		}
	
	
	
	
	

}
