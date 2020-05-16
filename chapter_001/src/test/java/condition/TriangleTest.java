package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        double trianglArea = 0;
        boolean result = Triangle.exist(3.0, 3.0, 3.0);
        if (result == true) {
            trianglArea = TrgArea.area(3.0, 3.0, 3.0);
            assertThat(trianglArea, is(3.897114317029974));
        } else {
            assertThat(result, is(false));
        }
    }

    @Test
    public void whenNotExist() {
        double trianglArea = 0;
        boolean result = Triangle.exist(12.0, 4.0, 6.0);
        if (result == true) {
            trianglArea = TrgArea.area(12.0, 4.0, 6.0);
            assertThat(trianglArea, is(3.897114317029974));
        } else {
            assertThat(result, is(false));
        }
    }
}
