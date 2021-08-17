package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rls = Math.sqrt(fifth);
        // или одной формулой (из задании не указано как нужно написать для сдачи задачи):
        // double rls = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // 2 пункт задания гласит: "с различными аргументами", а в примере значения переменных в выводе статичные,
        // поэтому считаю верным доработать не только метод "main".
        System.out.print("Расстояние между точками (" + x1 + ", " + x2 + ") и (" + y1 + ", " + y2 + ") = ");
        return rls;
    }

    public static void main(String[] args) {
        double result = Point.distance(3,5,16,12);
        System.out.print(result);
    }
}
