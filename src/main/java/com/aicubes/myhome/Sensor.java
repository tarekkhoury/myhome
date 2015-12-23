package com.aicubes.myhome;

public class Sensor {

	
	private String sensorValue; //"private" means access to this is restricted

	public String getSensorValue()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.sensorValue;
	}
	public void setSensorValue(String value)
	{
	     //include more logic
	     this.sensorValue = value;
	}
	
}
