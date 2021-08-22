package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = p/(2*(k+1));
        return rsl;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
            double squareH = SqArea.square(p,k);
            double squareL = squareH * k;
            double squareS = squareH*squareL;
            System.out.println("k = " + k);
            System.out.println("L = " + squareL);
            System.out.println("H = " + squareH);
            System.out.println("P = " + p);
            System.out.println("S = " + squareS);
    }
}
