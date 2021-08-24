package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when06to24then2() {
        int x1 = 0;
        int y1 = 6;
        int x2 = 2;
        int y2 = 4;
        double expected = 2.828;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10x3to2x88then85() {
        int x1 = 10;
        int y1 = 3;
        int x2 = 2;
        int y2 = 88;
        double expected = 85.375;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when45Mx8to16x24Mthen68() {
        int x1 = -45;
        int y1 = 8;
        int x2 = 16;
        int y2 = -24;
        double expected = 68.883;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}