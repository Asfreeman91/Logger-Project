package com.promineotech;

public class App  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger loggerAsterisk = new AsteriskLogger();
		Logger loggerSpaced = new SpacedLogger();
		
		loggerAsterisk.log("Today has been a good day");
		loggerAsterisk.error("An unknown error has occurred");
		loggerSpaced.log("Today has been a good day");
		loggerSpaced.error("ERROR: " + "An unknown error has occurred");
		

		
	}

}
