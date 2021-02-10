package deignPatterns.structural.facade;

/**
 * Facade hides the complexity from the client and exposes only access to it.
 * Eg. House or Restaurant ar Car.
 */
public class FacadeMain {

    public static void main(String[] args) {
        AirFlowController airFlowController = new AirFlowController();
        CoolingController coolingControoler = new CoolingController();
        FilterSystem filterSystem = new FilterSystem();
        FuelInjector fuelInjector = new FuelInjector();
        Starter starter = new Starter();

        //this is the complexity wich we need to simplify for the client
        airFlowController.takeAir();
        coolingControoler.setTemperatureLimit();
        coolingControoler.run();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.inject();
        starter.start();

        //we need facade to hide the complexity from the user

        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        //coding car moving logic...
        carEngineFacade.stopEngine();
    }
}
