package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= 9; i++) {
            if (number != i && number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}