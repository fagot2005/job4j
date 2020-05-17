package oop;

public class Predator extends Animal {

    public Predator(String name) {
        super(name);
    }

    public Predator() {
        super();
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
