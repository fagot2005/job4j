package oop;

public class Battery {
    public int load;

    public Battery(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery another = new Battery(0);
        System.out.println(first.load + " " + another.load);
        first.exchenge(another);
        System.out.println(first.load + " " + another.load);
        first.exchenge(another);
        System.out.println(first.load + " " + another.load);
        first.exchenge(another);
        System.out.println(first.load + " " + another.load);
    }

    public void exchenge(Battery another) {
        this.load = this.load - 25;
        another.load = another.load + this.load;
    }
}
