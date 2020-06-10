package polymorphism;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать. Как Вас зовут?");
        String name = input.nextLine();
        name = name.toUpperCase().substring(0, 1)
                + name.toLowerCase().substring(1);
        System.out.println(name + ", рады Вас видеть");
    }
}
