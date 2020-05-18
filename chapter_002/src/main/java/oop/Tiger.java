package oop;

public class Tiger extends Predator {

    public Tiger(String name) {
        super(name);
        System.out.println(this.getClass().getName());
    }

    public Tiger() {
        super();
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
