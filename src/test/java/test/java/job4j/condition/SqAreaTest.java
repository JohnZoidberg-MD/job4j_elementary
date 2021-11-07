package test.java.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2thenSqArea2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4thenSqArea4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP84K7thenSqArea182() {
        int expected = 182;
        int p = 84;
        double k = 7.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}