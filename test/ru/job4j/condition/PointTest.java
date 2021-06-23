package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to1212then2() {
        double expected = 14.14;
        int x1 = 2;
        int y1 = 2;
        int x2 = 12;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1015to11then2() {
        double expected = 16.64;
        int x1 = 10;
        int y1 = 15;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10010500to543123then2() {
        double expected = 10386.45;
        int x1 = 100;
        int y1 = 10500;
        int x2 = 543;
        int y2 = 123;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}