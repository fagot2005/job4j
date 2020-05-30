package polymorphism;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int allCount = 11;
        int win = 1;
        System.out.println("Приветствую тебя в игре 11. Правила игра очень просты. ");
        System.out.println("Ты всегда начинаешь и можешь взять от 1 до 3 спичек включительно.");
        System.out.println("Проиграет тот, кто зберет последнюю спичку.");
        while (allCount > 0) {
            if (win % 2 != 0) {
                System.out.println("Ход первого игрока, сколько спичек ты берешь?");
            } else {
                System.out.println("Ход второго игрока, сколько спичек ты берешь?");
            }
            int count = Integer.valueOf(input.nextLine());
            allCount = allCount - count;
            System.out.println("Осталось " + allCount + " спичек");
            if (allCount <= 0) {
                break;
            }
            win = win + 1;
        }
        if (win % 2 == 0) {
            System.out.println("Cпички кончились, первый игрок выиграл");
        } else {
            System.out.println("Cпички кончились,  второй игрок выиграл");
        }
    }
}
