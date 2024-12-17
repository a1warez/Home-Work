package HW.OOP.Anonymous;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Printer printer11 = new Printer() {
            @Override
            public void print() {
                System.out.println("GOD");
            }
        };
        printer11.print();

        Printer printer12 = () -> System.out.println("not god");
        printer12.print();

        PrinterPlus printerPlus11 = new PrinterPlus() {
            @Override
            public void print(String message) {
                int i = message.length();
                System.out.println(message);
                System.out.println("длина сообщения – " + i);
            }
        };
        printerPlus11.print("Java");

        PrinterPlus printerPlus22 = (message) -> {
            int i = message.length();
            System.out.println(message);
            System.out.println("длина сообщения – " + i);
        };
        printerPlus22.print("Python");

        List<String> names = Arrays.asList("Anna", "Violetta", "Max", "Bob");

        System.out.println(names);
        compare compare = new compare() {
            @Override
            public void compare(List<String> stringList) {
                Collections.sort(stringList, (p1, p2) -> p2.compareTo(p1));
            }
        };
        compare.compare(names);
        System.out.println(names);

        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        List<String> result = words.stream()
                .filter(w -> w.length() > 4)
                .map(String :: toUpperCase)
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
