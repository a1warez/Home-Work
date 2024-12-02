package HW.OOP.HW.Set;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, -2, 1, -4, -56, 4, 55, 213, -5, 6, 7};
        System.out.println(SetMetod.getIntegerUniqueElements(num));

        String[] words = {"apple", "banana", "apple", "cherry", "banana", "add", "qwerty", "add", "cherry"};
        System.out.println(SetMetod.getStringUniqueElements(words));

        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, -40, -20, -10};
        System.out.println(Arrays.toString(SetMetod.findClosestNumbers(numbers, 5)));

    }
}
