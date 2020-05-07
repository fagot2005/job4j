package array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void sort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void sortSecond() {
        int[] input = new int[] {5, 3, 1, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void sortThird() {
        int[] input = new int[] {1, 1, 1, 1, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 1, 1, 5};
        assertThat(result, is(expect));
    }

}