package ru.job4j;

public class Calculator {
    public static void plus(int first, int second) {
        System.out.println(first + second);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
