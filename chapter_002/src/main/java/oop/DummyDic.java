package oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic finalString = new DummyDic();
        System.out.println(finalString.engToRus("Hello"));
    }

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }
}
