/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignments.a2;


import newtemp.NewTempSensor.NewTempSensorDevice;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.hardware.OldSensorDevice;


/**
 *
 * @author Sotirios
 */
public class Main {
    Main p = new Main();

    public static void main(String[] args) throws InterruptedException {

        
        // ***
        // SCENARIO 1 - Exercise 1
        // ***

        TemperatureSensor o1 = new OldTempSensorAdapter();
        o1.setID("o1");
        
        // Creating a new OldTemp Hardware Device and passing a TemperatureSensor in it 
        OldSensorDevice olddev = new OldSensorDevice(o1);
        // Start the scenario
        olddev.start();
        //**** NEW ***** 
        System.out.println("Last reading sent from device was " + o1.getReading());
       
       
        
        // ***
        // SCENARIO 2 - Exercise 2
        // ***
        
        //Creating the adapter
        NewTempSensorAdapter o2 = new NewTempSensorAdapter();
        o2.setID("o2");
      
        //Creating a new NewTemp Hardware Device and passing a NewTempSensor in it.
        NewTempSensorDevice newdev = new NewTempSensorDevice(o2.getAdatptee());
        
        // Part 1: Play the device scenario
        newdev.start();
        // Part 2: Get the last reading
        System.out.println("Last reading sent from device was " + o2.getReading());
        // Part 3: Trigger your own temperature event:
        o2.newTemperature(35);
        
        
        
        // ***
        // Exercise 3
        // ***
        
        OurFurnace n = new PlainGasF1();
        n = new Humidifier(n);
        n = new WiFi(n);
        n.turnOn();
    }
}