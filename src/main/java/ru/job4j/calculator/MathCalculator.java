package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multyply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return difference(first, second) + div(first, second);
    }

    public static double sumAllFunc(double first, double second) {
                return sumAndMultiply(first, second) + differenceAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета примера равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета задания п.3.1 равен " + differenceAndDiv(10, 20));
        System.out.println("Результат расчета задания п.3.2 равен " + sumAllFunc(10, 20));
    }
}
