package deignPatterns.structural.facade;

public class CoolingController {
    public void setTemperatureLimit(){
        System.out.println("Setting temperature to 70");
    }

    public void run(){
        System.out.println("Cooling controller is running...");
    }
}
