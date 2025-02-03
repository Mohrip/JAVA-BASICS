package Training.OOP;

public class Car extends Vehicle {

public Car(String name, String model, String color, int year) {
        super(name, model, color, year);
    }


    public void accelerate() {
        System.out.println("The vehicle is accelerating...");
    }

    public void brake() {
        System.out.println("The vehicle is braking...");
    }

    public void turnLeft() {
        System.out.println("The vehicle is turning left...");
    }

    public void turnRight() {
        System.out.println("The vehicle is turning right...");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Black", 2020);
        System.out.println("Car name: " + car.getName() + "\nCar model: " + car.getModel() + "\nCar color: " + car.getColor() + "\nCar year: " + car.getYear());
        car.start();
        car.accelerate();
        car.turnLeft();
        car.turnRight();
        car.brake();
        car.stop();
    }
    
}
