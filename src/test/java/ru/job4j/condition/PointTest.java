package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when21to24then3() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 4);
        double expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to26then4() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 6);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}