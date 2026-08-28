import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String brand;
    private String model;
    private double mileage;

    public Vehicle(String brand, String model, double mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    public double calculateTravelCost(double distance, double fuelPrice) {
        double fuelRequired = distance / mileage;
        return fuelRequired * fuelPrice;
    }

    public void displayInfo() {
        System.out.println(brand + " " + model);
        System.out.printf("Mileage: %.0f km/l%n", mileage);
    }
}


class Car extends Vehicle {

    public Car(String brand, String model, double mileage) {
        super(brand, model, mileage);
    }

    @Override
    public double calculateTravelCost(double distance, double fuelPrice) {

        double baseCost = super.calculateTravelCost(distance, fuelPrice);

        return baseCost * 1.05;
    }
}


class Suv extends Car {

    public Suv(String brand, String model, double mileage) {
        super(brand, model, mileage);
    }

    @Override
    public double calculateTravelCost(double distance, double fuelPrice) {

        double baseCost = super.calculateTravelCost(distance, fuelPrice);

        double vehicleBaseCost = baseCost / 1.05;

        return vehicleBaseCost * 1.15;
    }
}


public class Main {

    public static void main(String[] args) {

        double distance = 300;
        double fuelPrice = 100;

        Vehicle basicVehicle = new Vehicle("Tata", "Ace", 20);
        Car car = new Car("Honda", "City", 18);
        Suv suv = new Suv("Toyota", "Fortuner", 12);

        System.out.println("** Vehicle Travel Cost **");
        basicVehicle.displayInfo();
        System.out.printf(
                "Travel Cost: %.2f%n%n",
                basicVehicle.calculateTravelCost(distance, fuelPrice)
        );

        System.out.println("** Car Travel Cost **");
        car.displayInfo();
        System.out.printf(
                "Travel Cost: %.2f%n%n",
                car.calculateTravelCost(distance, fuelPrice)
        );

        System.out.println("** SUV Travel Cost **");
        suv.displayInfo();
        System.out.printf(
                "Travel Cost: %.2f%n%n",
                suv.calculateTravelCost(distance, fuelPrice)
        );

        System.out.println("** Upcasting & Runtime Polymorphism **");

        Vehicle vehicle = suv;

        System.out.println("Reference Type : Vehicle");
        System.out.println("Actual Type    : " + vehicle.getClass().getSimpleName());
        System.out.println("Calculation    : Suv.calculateTravelCost()");

        double polymorphicCost =
                vehicle.calculateTravelCost(distance, fuelPrice);

        System.out.printf(
                "Travel Cost    : %.2f%n%n",
                polymorphicCost
        );

        System.out.println("** Vehicle Collection **");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(basicVehicle);
        vehicles.add(car);
        vehicles.add(suv);
        vehicles.add(new Car("Maruti", "Swift", 22));
        vehicles.add(new Suv("Mahindra", "XUV700", 14));

        for (Vehicle v : vehicles) {

            System.out.println(v.getBrand() + " " + v.getModel());
            System.out.printf("Mileage: %.0f km/l%n", v.getMileage());

            double cost = v.calculateTravelCost(distance, fuelPrice);

            System.out.printf("Travel Cost: %.2f%n%n", cost);
        }
    }
}