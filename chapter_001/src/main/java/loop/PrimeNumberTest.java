package loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
            int count = prime.calc(5);
        assertThat(count, is(3));
    }
    @Test
    public void when10() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(10);
        assertThat(count, is(4));
    }

    @Test
    public void when20() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(20);
        assertThat(count, is(8));
    }
}
