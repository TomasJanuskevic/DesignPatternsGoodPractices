package deignPatterns.creational.singleton.example2;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A6");
        Car volvo = new Car("Volvo", "XC60");

        Garage garage = Garage.getGarage();

        garage.addCar(audi);
        garage.addCar(volvo);

        System.out.println(garage.getCars());
    }
}
