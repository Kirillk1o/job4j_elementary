package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConverter140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter600RblThen10Dollar() {
        float in = 600;
        float expected = 10;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter300DollarThen18000Rbl() {
        float in = 300;
        float expected = 18000;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter2EuroThen140Rbl() {
        float in = 2;
        float expected = 140;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}