package InDepth.Section7;

public class Cat extends Animal {

    public Cat(String name, String type, double weight) {
        super(name, type, weight);
    }

    public void eat(String type) {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void move() {
        System.out.println("Cat is moving");
    }

    public void purr() {
        System.out.println("Cat is purring");
    }

    public void scratch() {
        System.out.println("Cat is scratching");
    }

    
}
