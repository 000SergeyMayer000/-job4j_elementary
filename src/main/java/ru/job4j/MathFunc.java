package ru.job4j;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        System.out.println(MathFunc.func1(3) + MathFunc.func2(5));
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
    }
}
