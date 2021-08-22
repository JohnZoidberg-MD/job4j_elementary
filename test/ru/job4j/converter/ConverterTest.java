package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert180RubleThen2Euro() {
        float in = 180;
        float expected = 2.25f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RubleThen2Dollar() {
        float in = 180;
        float expected = 2.4f;
        float out = Converter.rublesToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}