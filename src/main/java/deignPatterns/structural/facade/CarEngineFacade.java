package deignPatterns.structural.facade;

public class CarEngineFacade {
    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private FilterSystem filterSystem = new FilterSystem();
    private FuelInjector fuelInjector = new FuelInjector();
    private Starter starter = new Starter();

    public void startEngine() {
        airFlowController.takeAir();
        coolingController.setTemperatureLimit();
        coolingController.run();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.inject();
        starter.start();
    }

    public void stopEngine(){

        //Complexity
        System.out.println("Engine is stopped");
    }
}
