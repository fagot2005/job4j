package converter;

public class Converter {

        public static int rubleToEuro(int value) {
            return value / 70;
        }

        public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
            int euro = rubleToEuro(140);
            int dollar = rubleToDollar(500);
            int eurokross = dollarToRuble(1000);
            int dollarkross = euroToRuble(2000);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("500 rubles are " + dollar + " dollar.");
            System.out.println("1000 Euro are " + eurokross + " rubles.");
            System.out.println("2000 Dollar are " + dollarkross + " rubles.");

            int inrubleToEuro = 140;
            int expectedrubleToEuro = 2;
            int outrubleToEuro = rubleToEuro(inrubleToEuro);
            boolean passedrubleToEuro = expectedrubleToEuro == outrubleToEuro;
            System.out.println("140 rubles are 2. Test result : " + passedrubleToEuro);

            int inrubleToDollar = 120;
            int expectedrubleToDollar = 2;
            int outrubleToDollar = rubleToDollar(inrubleToDollar);
            boolean passedrubleToDollar = expectedrubleToDollar == outrubleToDollar;
            System.out.println("120 rubles are 2. Test result : " + passedrubleToDollar);

            int inrubleToDollarKross = 1000;
            int expectedrubleToDollarKross = 60000;
            int outrubleToDollarKross = dollarToRuble(inrubleToDollarKross);
            boolean passedrubleToDollarKross = expectedrubleToDollarKross == outrubleToDollarKross;
            System.out.println("1000 dollars are 60000. Test result : " + passedrubleToDollarKross);

            int inrubleToEuroKross = 1000;
            int expectedrubleToEuroKross = 70000;
            int outrubleToEuroKross = euroToRuble(inrubleToEuroKross);
            boolean passedrubleToEuroKross = expectedrubleToEuroKross == outrubleToEuroKross;
            System.out.println("1000 dollars are 70000. Test result : " + passedrubleToEuroKross);
        }
    }