package com.aicubes.myhome;

import junit.framework.TestCase;

public class TestSensor extends TestCase {

	
	public void test() {
	
	Sensor sensor = new Sensor();
	sensor.setSensorValue("test");
	String testValue = sensor.getSensorValue();
	assertEquals("test", testValue);
	}
}
