package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K4Square16() {
        int p = 20;
        double k = 4;
        int expected = 16;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP32K3Square48() {
        int p = 32;
        double k = 3;
        int expected = 48;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}