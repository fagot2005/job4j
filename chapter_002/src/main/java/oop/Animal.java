package oop;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        super();
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
