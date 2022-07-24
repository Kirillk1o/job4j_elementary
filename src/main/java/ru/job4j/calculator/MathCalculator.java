package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOperation(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета №1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета №2 равен: " + sumOperation(200, 50));
        System.out.println("Результат расчета №3 равен: " + sumOperation(400, 20));
    }
}
