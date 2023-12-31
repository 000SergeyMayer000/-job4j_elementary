package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 176;
        double man = Fit.manWeight(height);
        short height2 = 164;
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 176 is " + man);
        System.out.println("Man 164 is " + woman);
    }
}
