package goodPractices.solid;

import java.time.LocalDate;
import java.time.Period;

/**
 * SOLID
 * Single Responsibility (Viena atsakomybe)
 * <p>
 * Class should have only one responsibility
 */
public class Vehicle {

    private String brand;
    private String model;
    private LocalDate fabricationDate;
    private String licensePlate;
    private LocalDate lastInspectionDate;

    public boolean isInspectionOverdue() {
        LocalDate curentTime = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspectionDate, curentTime);

        int differenceInYears = timeSinceLastInspection.getYears();

        return differenceInYears >= 1 ? true : false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(LocalDate lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }
}
