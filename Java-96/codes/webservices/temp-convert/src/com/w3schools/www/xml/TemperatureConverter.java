package com.w3schools.www.xml;

public class TemperatureConverter {

	public static void main(String[] args) throws Exception{
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		String cel = "35"; 
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah+"F");
	}

}
