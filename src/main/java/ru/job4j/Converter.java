package ru.job4j;

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
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollars = Converter.rubleToDollar(500);
        System.out.println("500 rubles are " + dollars + " dollars.");

        float rs1 = Converter.dollarToRuble(300);
        System.out.println("300 dollars are " + rs1 + " rubles.");

        float euro1 = Converter.euroToRubles(2);
        System.out.println("2 euro are " + euro1 + " rubles.");
    }
}
