package condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double perimetr = 0.5*(a+b+c);
        double area = Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
        return area;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
