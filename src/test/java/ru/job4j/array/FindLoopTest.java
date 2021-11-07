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

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = new int[]{5, 2, 5, 10, 2, 4};
        int el = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind4False() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 4;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
