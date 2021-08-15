package ru.job4j.converter;

public class Converter {

    public static float rubToEur(float value) {
        float rslt = value / 70F;
        return rslt;
    }

    public static float rubToUsd(float value) {
        float rslt = value / 60F;
        return rslt;
    }

    public static void main(String[] args) {
        Float rub = 140F;
        float eur = Converter.rubToEur(rub);
        float usd = Converter.rubToUsd(rub);
        System.out.println(rub + " rubles = " + eur + " euros");
        System.out.println(rub + " rubles = " + usd + " dollars");
    }
}
