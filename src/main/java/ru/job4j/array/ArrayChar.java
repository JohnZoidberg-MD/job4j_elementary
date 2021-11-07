package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWithOLD(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            result = result && (word[i] == pref[i]);
        }
        return result;
    }

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
            }
        }
        return result;
    }
}

