package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = square(p, k);
        System.out.println("S = " + result);
    }
}
