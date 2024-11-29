package HW.OOP.HW.Generic;


import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<>(5);
        Box<String> boxString = new Box<>("Name");

        System.out.println(boxInteger.getObject());
        System.out.println(boxString.getObject());

        System.out.println(boxInteger.isEmpty());
        System.out.println(boxString.isEmpty());

        boxInteger.clear();

        System.out.println(boxInteger.isEmpty());
        System.out.println(boxString.isEmpty());




    }
}
