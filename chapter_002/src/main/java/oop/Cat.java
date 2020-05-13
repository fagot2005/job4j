package oop;

public class Cat {
    private String food;
    private String nick;

    public void show() {
        System.out.println(this.nick + " eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.nick = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.nick = "Gav";
        gav.show();
        System.out.println("There are black's food.");
        Cat blask = new Cat();
        blask.eat("fish");
        blask.nick = "Blask";
        blask.show();
    }
}
