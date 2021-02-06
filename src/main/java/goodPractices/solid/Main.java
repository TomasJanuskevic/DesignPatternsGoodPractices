package goodPractices.solid;

import java.time.LocalDate;

/**
 * L - Liskov's Substitution.
 * <p>
 * If class A is a subtype of class B.
 * Then we shou;d be able to replace B whith A withaut disrupting the behavior of the program.
 */
public class Main {

    public static void main(String[] args) {
        InspectionService inspectionService = new InspectionService();

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Volvo");
        vehicle.setModel("XC90");
        vehicle.setLicensePlate("SDA999");
        vehicle.setFabricationDate(LocalDate.of(2018, 1,1));
        vehicle.setLastInspectionDate(LocalDate.of(2019,1,1));

        inspectionService.executeAnnualInspection(vehicle);

        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("SQ5");
        car.setLicensePlate("SDA123");
        car.setFabricationDate(LocalDate.of(2015, 1,1));
        car.setLastInspectionDate(LocalDate.of(2017,1,1));
        car.setNumbersOfDoors(4);

        inspectionService.executeAnnualInspection(car);


    }
}
