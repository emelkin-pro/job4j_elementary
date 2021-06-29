package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int f = 5;
        int expect = 120;
        int out = Factorial.calc(f);
        Assert.assertEquals(out, expect);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int f = 1;
        int expect = 1;
        int out = Factorial.calc(f);
        Assert.assertEquals(out, expect);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}