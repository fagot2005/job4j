package exception;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import static org.junit.Assert.*;

public class FactTest {

    @Test (expected = IllegalArgumentException.class)
    public void calc() {
        int rls = Fact.calc(-3);
        assertThat(rls, is(3) );
    }
}