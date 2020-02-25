package loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactorialFive() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenFactorialThen() {
        int rsl = Factorial.calc(10);
        int expected = 3628800;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenFactorialZero() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}


