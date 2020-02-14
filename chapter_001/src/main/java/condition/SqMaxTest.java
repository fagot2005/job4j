package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void testSqMax1 () {
            SqMax check = new SqMax();
             int result = check.max(55, 4, 2, 12);
             assertThat(result, is(55));
            }
     @Test
        public void testSqMax2 () {
        SqMax check = new SqMax();
        int result = check.max(6, 90, 7, 5);
        assertThat(result, is(7));
    }
    @Test
        public void testSqMax3 () {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
        public void testSqMax4 () {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 50);
        assertThat(result, is(50));
    }
}
