package oop;

public class Predator extends Animal {

    public Predator(String name) {
        super(name);
        System.out.println(this.getClass().getName());
    }

    public Predator() {
        super();
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
