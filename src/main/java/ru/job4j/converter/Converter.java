package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 98;  //11,11,2023
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 92;  //11,11,2023
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1400);
        System.out.println("1400 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToEuro(2000);
        System.out.println("2000 rubles are " + dollar + " dollars.");
    }
}
