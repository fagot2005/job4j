package oop;

public class Battery {
    public int value;

    public Battery(int another) {
        this.value = another;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery bataryConsumption = new Battery(25);
        System.out.println(battery.value);
        battery.exchenge(bataryConsumption);
        System.out.println(battery.value);
    }

    public void exchenge(Battery another) {
        this.value = this.value - another.value;
    }
}
