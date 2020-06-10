package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(14, 4, 2);
        assertThat(result, is(14));
    }
    @Test
    public void whenThridMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 22);
        assertThat(result, is(22));
    }
    @Test
    public void whenAllSame() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
