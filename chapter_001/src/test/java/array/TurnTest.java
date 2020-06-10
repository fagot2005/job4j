package array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


class TurnTest {

    @Test
    void EvenArray() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expect = new int[] {6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));

        for (int index = 0; index < expect.length; index++) {
            System.out.println(expect[index]);
        }
    }

    @Test
    void OddArray() {
        int[] input = new int[] {11, 12, 13, 14, 15, 16, 17};
        int[] result = Turn.back(input);
        int[] expect = new int[] {17, 16, 15, 14, 13, 12, 11};
        assertThat(result, is(expect));

        for (int index = 0; index < expect.length; index++) {
            System.out.println(expect[index]);
        }
    }

}