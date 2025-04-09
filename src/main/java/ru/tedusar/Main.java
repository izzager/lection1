package ru.tedusar;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        ///////////////////// Collections //////////////////////////////////////////////
        // Set - коллекция, хранящая в себе уникальные элементы.
        Set<String> set = new HashSet<>(); // Set - это интерфейс (набор методов), а HashSet - его реализация.
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        System.out.println(set); // [1,2,3]

        // List - коллекция, хранящая в себе элементы в порядке их добавления.
        List<String> arrayList = new ArrayList<>(); // ArrayList - обычный список по типу массива.
        arrayList.add("1");                         // Элементы в памяти хранятся друг за другом
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("3");
        System.out.println(arrayList); // [1,2,3,3]
        System.out.println(arrayList.get(0)); // 1

        List<String> linkedList = new LinkedList<>(); // LinkedList - двусвязный список.
        linkedList.add("1");                         // Элементы содержат ссылку на предыдущий и следующий элементы
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("3");
        System.out.println(linkedList); // [1,2,3,3]

        // Map - коллекция, хранящая в себе пары ключ-значение.
        Map<String, String> map = new HashMap<>(); // HashMap - обычный словарь.
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        System.out.println(map); // [a=1, b=2, c=3]
        System.out.println(map.get("a")); // 1

        /////////////////////// Exceptions ////////////////////////////////////
        try {
            testMethod2();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument");
        } catch (NullPointerException e) {
            System.out.println("Null pointer"); // выведется эта строка, потому что в методе testMethod2() выбрасывается NullPointerException
        } catch (Exception e) {
            System.out.println("Exception"); // в этот блок уже не зайдем, потому что зашли в catch (NullPointerException e)
        }

        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage()); // hello world!!! . выведется эта строка, потому что мы ее переопределили
        }

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // выведется null, потому что это базовое поведение
        }

        try {
            testMethod2();
        } finally { // finally - блок, который выполняется всегда, даже если исключение выброшено в try
            System.out.println("finally"); // выведется эта строка, несмотря на то, что в методе testMethod2() выбрасывается NullPointerException
        }
    }

    // Пример проверяемого исключения.
    // Обязательно должен быть указан тип исключения, которое может быть выброшено (в throws ...)
    private static void testMethod1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    // Пример не проверяемого исключения.
    // Тип исключения не указывается, т.к. оно не проверяемое - потому что наследуется от RuntimeException
    private static void testMethod2() {
        throw new NullPointerException();
    }
}