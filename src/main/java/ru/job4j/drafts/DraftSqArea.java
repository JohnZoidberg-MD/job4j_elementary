package ru.job4j.drafts;

public class DraftSqArea {
    public static double square(double p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        double p = 84;
        double k = 7.56;
        double result = square(p, k);
        System.out.println("S = " + result);
    }
}
