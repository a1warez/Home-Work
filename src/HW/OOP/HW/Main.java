package HW.OOP.HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "java is fun and java is powerful";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char charr = string.charAt(i);
            if (charr != ' '){
                map.put(charr, map.getOrDefault(charr, 0) + 1);
            }
        }
        System.out.println(map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "C");
        map1.put(2, "B");
        map1.put(3, "A");
        System.out.println(map1);

        System.out.println(metod.reversMap(map1));

        ComparatorName comparatorName = new ComparatorName();
        ComparatorYear comparatorYear = new ComparatorYear();

        TreeSet<Student> studentListName = new TreeSet<>(comparatorName);

        studentListName.add(new Student("Alina", 18));
        studentListName.add(new Student("Egor", 20));
        studentListName.add(new Student("Sophia", 19));
        studentListName.add(new Student("Mark", 21));
        studentListName.add(new Student("Violetta", 20));

        System.out.println(studentListName);

        TreeSet<Student> studentListYear = new TreeSet<>(comparatorYear);

        studentListYear.add(new Student("Alina", 18));
        studentListYear.add(new Student("Egor", 20));
        studentListYear.add(new Student("Sophia", 19));
        studentListYear.add(new Student("Mark", 21));
        studentListYear.add(new Student("Violetta", 20));

        System.out.println(studentListYear);
    }
}
