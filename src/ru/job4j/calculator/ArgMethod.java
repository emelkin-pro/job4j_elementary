package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void hello() {
        System.out.println("Hello, please enter your name and weight" );
    }
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age: , " + age);
    }
    public static void hello(int age) {
        System.out.println("Hello, your age: " + age);
    }
    public static void hello(String firstName, String secondName, String thirdName) {
        System.out.println("Hello, " + firstName + " " + secondName + " " + thirdName);
    }
    public static void main(String[] args) {
        String name = "Oleg Emelyanov";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}
