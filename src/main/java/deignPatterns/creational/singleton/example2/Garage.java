package deignPatterns.creational.singleton.example2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private static Garage garage;
    private List<Car> cars = new ArrayList<>();

    private Garage() {
    }

    public static Garage getGarage() {
        if (garage == null) {
            garage = new Garage();
        }
        return garage;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
