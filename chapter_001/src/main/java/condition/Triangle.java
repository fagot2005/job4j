package condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point thrid;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.thrid = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(thrid);
        double c = second.distance(thrid);
        double p = period(a, b, c);
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            rsl = -1;
        }
            return rsl;
    }
}