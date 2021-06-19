package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age: , " + age);
    }

    public static void main(String[] args) {
        String name = "Oleg Emelyanov";
        int age = 33;

        ArgMethod.hello(name, age);

    }
}
