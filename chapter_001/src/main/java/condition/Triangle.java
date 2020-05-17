package condition;

public class Triangle {

    private double first;
    private double second;
    private double thrid;

    public Triangle(double first, double second, double thrid) {
        this.first = first;
        this.second = second;
        this.thrid = thrid;
    }

    public static boolean exist(Triangle triangle) {
        boolean existfalse = false;
        if ((triangle.first + triangle.second) > triangle.thrid
                && (triangle.second + triangle.thrid) > triangle.first
                && (triangle.first + triangle.thrid) > triangle.second) {
            existfalse = true;
        }
        return existfalse;
    }

    public static double area(Triangle triangle) {
        double perimetr = 0.5 * (triangle.first + triangle.second + triangle.thrid);
        return Math.sqrt(perimetr * (perimetr - triangle.first)
                * (perimetr - triangle.second)
                * (perimetr - triangle.thrid));
    }
}
