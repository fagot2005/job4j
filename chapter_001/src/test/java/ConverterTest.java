package converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int dollar = 600;
        int expected = 10;
        int out = Converter.rubleToDollar(dollar);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int dollarkross=1000;
        int expected = 60000;
        int out = Converter.dollarToRuble(dollarkross);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble(){
        int eurokross = 2000;
        int expected = 140000;
        int out = Converter.euroToRuble(eurokross);
        Assert.assertEquals(expected, out);
    }
}