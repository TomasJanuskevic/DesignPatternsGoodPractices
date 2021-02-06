package goodPractices.solid;

public interface MovingVehicle {

    void carSpecificBehavior();
    void accelerate();
    void brake(); // reduce speed.
    void fly(); //seregate interface methods. This fly should belong to another interface.

}
