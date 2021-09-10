package ru.job4j.array;

public class AlgoArray {
    public static int[] sortArray(int[] mass) {
        for (int j = 0; j < mass.length - 1; j++) {
            for (int i = 0; i < mass.length; i++) {
                if (i + 1 < mass.length) {
                    if (mass[i] > mass[i + 1]) {
                        int temp = mass[i];
                        mass[i] = mass[i + 1];
                        mass[i + 1] = temp;
                    }
                }
            }
        }
        return mass;
    }

    public static void main(String[] args) {
        int[] newMass = new int[]{5, 3, 2, 1, 4};
        int[] sortMass = sortArray(newMass);
        for (int i : sortMass) {
            System.out.print(i + " ");
        }
    }
}
