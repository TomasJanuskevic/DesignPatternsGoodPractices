package goodPractices.solid;

import java.time.LocalDate;

public class InspectionService {

    public void executeAnnualInspection(Vehicle vehicle){
        System.out.println("Inspecting vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());

        if(vehicle.isInspectionOverdue()){
            System.out.println("WARNING: Vehicle has overdue technikine!");

            executeInspectionDuties();

            vehicle.setLastInspectionDate(LocalDate.now());
        }
    }

    private void executeInspectionDuties() {
        System.out.println("Checking breaks and windshield"); //Galetu tureti naula klase
        System.out.println("Checking exhuastion system");//Galetu tureti naula klase
        System.out.println("Checking oil and stuff");//Galetu tureti naula klase
    }
}
