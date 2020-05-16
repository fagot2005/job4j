package condition;

import static java.lang.Math.*;

public class Point {

    public int x;
    public int y;
    public int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2));
    }

    public double distance3D(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println("result (" + a.x + ", " + a.y + ") to (" + b.x + ", " + b.y + ") = " + dist);
        Point a3D = new Point(0, 0, 0);
        Point b3D = new Point(5, 5, 5);
        double dist3D = a3D.distance3D(b3D);
        System.out.println("result (" + a3D.x + ", " + a3D.y + ", " + a3D.z + ") to "
                + "(" + b3D.x + ", " + b3D.y + ", " + b3D.z + ") = " + dist3D);
    }
}
