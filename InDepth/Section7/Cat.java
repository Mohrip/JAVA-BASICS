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

    public void meow() {
        System.out.println("Cat is meowing");
    }

    

public static void main(String[] args) {
    Cat cat = new Cat("Whiskers", "Cat", 10.0);
    cat.eat("Cat food");
    cat.sleep();
    cat.move();
    cat.purr();
    cat.scratch();
    cat.meow();
}}
