package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void when1To1Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenThridValues() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenThridValues2() {
        int result = Max.max(4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThridValues3() {
        int result = Max.max(4, 8, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenFourValues() {
        int result = Max.max(4, 8, 3, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenFourValues2() {
        int result = Max.max(4, 8, 16, 12);
        assertThat(result, is(16));
    }

    @Test
    public void whenFourValues3() {
        int result = Max.max(4, 20, 3, 12);
        assertThat(result, is(20));
    }

    @Test
    public void whenFourValues4() {
        int result = Max.max(44, 8, 3, 12);
        assertThat(result, is(44));
    }
}
