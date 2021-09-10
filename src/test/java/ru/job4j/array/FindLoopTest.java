package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {


    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then5() {
        int[] data = {0, 14, 32, 64, 54, 10, 26, 158, 4, -16};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasM6Then3() {
        int[] data = {5, 4, 3, -6, 8, 7};
        int el = -6;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas14ThenM1() {
        int[] data = {5, 4, 3, -6, 8, 7};
        int el = 14;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
