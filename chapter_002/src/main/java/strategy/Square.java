package strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "________" + ln
                + "|      |" + ln
                + "|      |" + ln
                + "|      |" + ln
                + "________" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}
