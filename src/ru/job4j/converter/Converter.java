package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 80;
    }

    public static float rublesToDollar(float value) {
        return value / 75;
    }

    public static void main(String[] args) {
        float rubles = 180;
        float euro = Converter.rubleToEuro(rubles);
        float dollar = Converter.rublesToDollar(rubles);
        System.out.println(rubles + " rubles = " + euro + " euros");
        System.out.println(rubles + " rubles = " + dollar + " dollars");

        System.out.println();

        float in = 180;
        float expectedEuro = 2.25f;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println(in + " rubles = " + expectedEuro + ". Test result: " + passedEuro);
        float expectedDollar = 2.4f;
        float outDollar = Converter.rublesToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(in + " rubles = " + expectedDollar + ". Test result " + passedDollar);
    }
}

