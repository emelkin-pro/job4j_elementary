package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight180Than92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight161Than58() {
        short in = 161;
        double expected = 58.65;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}