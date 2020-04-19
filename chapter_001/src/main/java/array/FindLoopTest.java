package array;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {15, 5, 3, 43, 90};
        int value = 43;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas15ThenNotFind() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {15, 5, 3};
        int value = -7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}