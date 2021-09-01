package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenAB2AC2BC2ThenTrue() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAB2AC5BC14ThenFalse() {
        double ab = 2;
        double ac = 5;
        double bc = 14;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}