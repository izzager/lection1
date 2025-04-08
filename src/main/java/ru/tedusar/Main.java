package ru.tedusar;

public class Main {
    public static void main(String[] args)  {
        try {
            test();
        } catch (MyCustomExpection e) {
            System.out.println(e);
        }
    }

    private static void test() {
        System.out.println("ABCCOEJCEJIOR");
    }
}