package ru.job4j.array;

public class SortSelected {
    public static int[] sortOLD(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, (data.length - 1));
            int index = FindLoop.indexOf(data, min);
            if (data[i] > min) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, (data.length - 1));
            int index = FindLoop.indexOfInRange(data, min, i, (data.length - 1));
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
