package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] calculations = new int[5];
        for (int i = 0; i < calculations.length; i++) {
            calculations[i] = i * 2 + 3;
        }
        for (int i = 0; i < calculations.length; i++) {
            System.out.println(calculations[i]);
        }
    }
}
