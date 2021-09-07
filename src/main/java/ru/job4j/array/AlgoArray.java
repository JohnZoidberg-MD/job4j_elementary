package ru.job4j.array;

public class AlgoArray {
    public static int[] sortArray(int[] mass) {
        for (int i2 = 0; i2 < mass.length - 1; i2++) {
            for (int i1 = 0; i1 < mass.length; i1++) {
                if (i1 + 1 < mass.length) {
                    if (mass[i1] > mass[i1 + 1]) {
                        int temp = mass[i1];
                        mass[i1] = mass[i1 + 1];
                        mass[i1 + 1] = temp;
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
