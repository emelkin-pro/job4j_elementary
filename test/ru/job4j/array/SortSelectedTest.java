package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort34125TO12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort657TO567() {
        int[] data = new int[] {6, 5, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }
}