package itec3030.assignments.a2;

import newtemp.NewTempSensor.NewTempSensorDriver;

public interface AbstractNewTempSensorAdapter {

	/**
	 * Returns the adaptee of this adapter. Useful for passing it to the device.
	 * @return A reference to the adaptee (a NewTempSensorDriver object)
	 */
	NewTempSensorDriver getAdatptee();

}