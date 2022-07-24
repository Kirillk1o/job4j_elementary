package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;
    }

    public static float rubleToDollar(float value) {
        float rs1 = value / 60;
        return rs1;
    }

    public static float dollarToRuble(float value) {
        float dollars = value * 60;
        return dollars;
    }

    public static float euroToRubles(float value) {
        float euro1 = value * 70;
        return euro1;
    }

    public static void main(String[] args) {
        float euro = ru.job4j.Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro: " + passed);
        float dollars = ru.job4j.Converter.rubleToDollar(500);
        float in1 = 500;
        float expected1 = (float) 8.3;
        float out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        System.out.println("500 rubles are " + dollars + " dollars: " + passed1);
        float rs1 = ru.job4j.Converter.dollarToRuble(300);
        float in2 = 300;
        float expected2 = 18000;
        float out2 = Converter.dollarToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("300 dollars are " + rs1 + " rubles: " + passed2);
        float euro1 = ru.job4j.Converter.euroToRubles(2);
        float in3 = 2;
        float expected3 = 140;
        float out3 = Converter.euroToRubles(in);
        boolean passed3 = expected3 == out3;
        System.out.println("2 euro are " + euro1 + " rubles: " + passed3);
    }
}
