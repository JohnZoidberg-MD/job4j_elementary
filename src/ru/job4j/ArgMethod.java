package ru.job4j;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("age = " + age);
        System.out.println("Hello, " + name + ", age = " + age);
        System.out.println("age = " + age + ", Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "job4j";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
