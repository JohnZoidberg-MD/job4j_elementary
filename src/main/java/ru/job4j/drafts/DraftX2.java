package ru.job4j.drafts;

public class DraftX2 {
    public static int  calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rsl = DraftX2.calc(a, b, c, x);
        System.out.print("(a, b, c, x) = (");
        System.out.print(a);
        System.out.print(", ");
        System.out.print(b);
        System.out.print(", ");
        System.out.print(c);
        System.out.print(", ");
        System.out.print(x);
        System.out.print(") = ");
        System.out.print(rsl);
    }
}
