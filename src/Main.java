// Step 1: Create the Product interface
interface Vehicle {
    String createVehicle();
}

// Step 2: Create concrete implementations of the Product (Concrete Products)
class Car implements Vehicle {
    @Override
    public String createVehicle() {
        return "Car has been created.";
    }
}

class Bike implements Vehicle {
    @Override
    public String createVehicle() {
        return "Bike has been created.";
    }
}

// Step 3: Create the Creator (Factory) abstract class
abstract class VehicleFactory {
    // The Factory Method
    public abstract Vehicle createVehicle();

    // Common operation that uses the factory method
    public String someOperation() {
        // Calls the factory method to create a product (vehicle)
        Vehicle vehicle = createVehicle();
        return "Factory: " + vehicle.createVehicle();
    }
}

// Step 4: Create concrete implementations of the Factory (Concrete Factories)
class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

// Step 5: Client code
public class Main {
    public static void main(String[] args) {
        // Client wants a Car
        VehicleFactory carFactory = new CarFactory();
        System.out.println("Client: I want a car.");
        System.out.println(carFactory.someOperation());

        // Client wants a Bike
        VehicleFactory bikeFactory = new BikeFactory();
        System.out.println("\nClient: I want a bike.");
        System.out.println(bikeFactory.someOperation());
    }
}
