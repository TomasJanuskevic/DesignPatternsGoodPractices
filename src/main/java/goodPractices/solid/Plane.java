package goodPractices.solid;

/**
 *
 * I - Interface segregation
 *
 * Interfaces should be split into smaller ones.
 * By doing so, we can ensure that implementing classes only need concentrate
 * on specific methods which they need.
 */


public class Plane implements MovingVehicle{

    @Override
    public void carSpecificBehavior() {

    }

    @Override
    public void accelerate() {
        System.out.println("go");
    }

    @Override
    public void brake() {
        System.out.println("Reducing speed..");
    }

    @Override
    public void fly() {
        System.out.println("Flying......");
    }
}
