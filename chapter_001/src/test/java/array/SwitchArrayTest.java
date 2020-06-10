package array;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class SwitchArrayTest {

    @Test
    void swap() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expect = new int[] {1, 2, 3, 6, 5, 4};
        assertThat(result, is(expect));
        for (int index = 0; index < expect.length; index++) {
            System.out.println(expect[index]);
        }
    }
}