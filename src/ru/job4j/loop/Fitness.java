package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int ivanPower = ivan;
        int nikPower = nik;
        while (ivanPower <= nikPower) {
            ivanPower *= 3;
            nikPower *= 2;
            month++;
        }
        return month;
    }
}
