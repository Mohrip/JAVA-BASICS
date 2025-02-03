package Training.OOP;

public class Vehicle {
    private String name;
    private String model;
    private String color;
    private int year;
    
    public Vehicle(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("The vehicle is starting...");
    }

    public void stop() {
        System.out.println("The vehicle is stopping...");
    }

 
    
}
