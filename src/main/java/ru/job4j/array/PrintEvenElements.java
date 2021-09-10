package ru.job4j.array;

import ru.job4j.condition.LogicNot;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            if (LogicNot.isEven(i + 1)) {
                System.out.println(
                        "Текущий элемент массива начиная с последнего: "
                                + numbers[numbers.length - 1 - i]
                );
            }
        }
    }
}