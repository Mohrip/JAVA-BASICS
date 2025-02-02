package InDepth.Section7;

public class Animal {
    private String name;
    private String type;
    private double weight;
    
    public Animal(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(String type) {
        System.out.println("Animal is eating");
    }



    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void move() {
        System.out.println("Animal is moving");
    }
}
