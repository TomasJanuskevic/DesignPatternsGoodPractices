package goodPractices.solid;


/**
 * O - Open for extension, Closed for modification
 *
 * Stop ourselfs from modifying existing code, causing potential new bugs instead extend the class
 * to add additional functionality or features
 */
public class Car  extends Vehicle implements MovingVehicle{

    private int numbersOfDoors;

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }


    public void carSpecificBehavior() {
        System.out.println("brrr");
    }

    @Override
    public void accelerate() {
        System.out.println("Gazuoju kaip masina");
    }

    @Override
    public void brake() {
        System.out.println("Stabdau kaip masina");
    }


    // @Override
   // public boolean isInspectionOverdue() {
    //    jei reikia override metoda savaip
   // }
}
