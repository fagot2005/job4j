package condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3D() {
        Point a3D = new Point(0, 0, 0);
        Point b3D = new Point(5, 5, 5);
        double dist3D = a3D.distance3D(b3D);
        assertThat(dist3D, is(8.660254037844387));
        }
}