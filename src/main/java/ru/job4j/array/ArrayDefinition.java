package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Petr Arsentev";
        names[1] = "Viktor Bondar";
        names[2] = "Alex Yakovlev";
        names[3] = "Dmitriy Shaplov";
        System.out.println("Размер массива 'ages' равен  = " + ages.length);
        System.out.println("Размер массива 'names' равен = " + names.length);
        System.out.println("Размер массива 'prices' равен = " + prices.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
