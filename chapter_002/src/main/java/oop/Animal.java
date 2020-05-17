package oop;

public class Animal {
    public Animal() {
        super();
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
