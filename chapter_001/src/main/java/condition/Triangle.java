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

    public static boolean exist(double ab, double ac, double bc) {
        Triangle triangle = new Triangle(ab, ac, bc);
        boolean existfalse = false;
        if ((ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac) {
            existfalse = true;
        }
        return existfalse;
    }
}
