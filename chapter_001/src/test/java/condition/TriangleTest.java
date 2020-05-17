package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void triangleInValid() {
    Triangle triangleInvalid = new Triangle(12, 4, 6);
    boolean result = Triangle.exist(triangleInvalid);
    if (result) {
        double trianglArea = Triangle.area(triangleInvalid);
        assertThat(trianglArea, is(3.897114317029974));
    } else {
        assertThat(result, is(false));
    }
}

    @Test
    public void triangleValid() {
        Triangle triangleValid = new Triangle(3.0, 3.0, 3.0);
        boolean result = Triangle.exist(triangleValid);
        if (result) {
            double trianglArea = Triangle.area(triangleValid);
            assertThat(trianglArea, is(3.897114317029974));
        } else {
            assertThat(result, is(false));
        }
    }
}
