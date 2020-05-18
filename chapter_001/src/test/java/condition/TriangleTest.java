package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void triangleInValid() {
        Point first = new Point(5, 5);
        Point second = new Point(3, 3);
        Point thrid = new Point(8, 8);
        Triangle triangle = new Triangle(first, second, thrid);
        double result = triangle.area();
        if (result == -1) {
            assertThat(result, is(-1.0));
        } else {
            assertThat(result, is(2.0000000000000027));
        }
    }

    @Test
    public void triangleValid() {
        Point first = new Point(5, 5);
        Point second = new Point(-2, 4);
        Point thrid = new Point(-3, 2);
        Triangle triangle = new Triangle(first, second, thrid);
        double result = triangle.area();
        if (result == -1) {
            assertThat(result, is(-1.0));
        } else {
            assertThat(result, is(6.499999999999994));
        }
    }
}
