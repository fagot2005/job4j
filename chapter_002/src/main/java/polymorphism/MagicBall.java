package polymorphism;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул. Что ты хочешь узнать?");
        String string = input.nextLine();
        int ansver = new Random().nextInt(3);
        if (ansver == 0) {
            System.out.println("Да");
        } else if (ansver == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
