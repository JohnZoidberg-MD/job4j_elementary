package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial5Then120() {
        int start = 5;
        int expected = 120;
        int result = Factorial.calc(start);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void factorial0Then1() {
        int start = 0;
        int expected = 1;
        int result = Factorial.calc(start);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void factorial12Then479001600() {
        int start = 12;
        int expected = 479001600;
        int result = Factorial.calc(start);
        Assert.assertEquals(result, expected);
    }
}