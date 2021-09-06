package test.java.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8to4Then8() {
        int left = 8;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7to7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}