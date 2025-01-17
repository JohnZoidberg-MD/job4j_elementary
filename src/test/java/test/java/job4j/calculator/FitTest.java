package test.java.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenManWeight180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeight170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}