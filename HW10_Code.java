package edu.neu.mgen;

// Create abstract class Vehicle
abstract class Vehicle {
    protected String brand; 

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void describe();

    public void color() {
        System.out.println("Midnight Cherry Red");
    }
}

// Derived class Car
class Car extends Vehicle {
    private String makeName;

    public Car(String brand, String makeName) {
        super(brand); 
        this.makeName = makeName;
    }

    public void describe() {
        System.out.println(makeName + " of " + brand + " is one of the best sell model.");
    }
}

// Derived class Motorbike
class Motorbike extends Vehicle {
    private String modelName;

    public Motorbike(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
    }

    public void describe() {
        System.out.println(brand + modelName + " is a good company.");
    }
}

// Derived class Aircraft
class Aircraft extends Vehicle {
    private int flightRange;

    public Aircraft(String brand, int flightRange) {
        super(brand);
        this.flightRange = flightRange;
    }

    public void describe() {
        System.out.println(brand + "can fly up to " + flightRange + " miles.");
    }
}

// Derived class Ship
class Ship extends Vehicle {
    private int thrust;

    public Ship(String brand, int thrust) {
        super(brand);
        this.thrust = thrust;
    }

    @Override
    public void describe() {
        System.out.println(brand + " ship has a huge " + thrust + " tons.");
    }
}

// Main class
public class HW10_Code {
    public static void main(String[] args) {
        // Create instances of each vehicle
        Car myCar = new Car("Ford", "Mustang");
        Motorbike myMotorbike = new Motorbike("Great Wall", "Topgun");
        Aircraft myFlight = new Aircraft("Airbus", 20000);
        Ship myStarShip = new Ship("SpaceX", 46000);

        // Call a common method accoring to myAircraft
        myFlight.color();

        // Call methods on each vehicle
        myCar.describe();
        myMotorbike.describe();
        myFlight.describe();
        myStarShip.describe();

        
    }
}
