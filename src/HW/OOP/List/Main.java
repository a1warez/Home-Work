package HW.OOP.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> num = new LinkedList<>();

        System.out.println("ArrayList: " + Metods.addNumbers(numbers));
        System.out.println("LinkedList: " + Metods.addNumbers(num));
        System.out.println("ArrayList: " +  Metods.random(numbers));
        System.out.println("LinkedList: " +  Metods.random(num));

        List<String> students = new ArrayList<>();

        students.add("Андрей");
        students.add("Виолетта");
        students.add("Кирилл");
        students.add("Максим");
        students.add("Кира");

        List<String> newStudents = new ArrayList<>();
        students.add("Павел");
        students.add("Сергей");
        students.add("Мария");

        students.addAll(newStudents);
        System.out.println(students);

        students.remove("Кира");
        students.remove(2);
        System.out.println(students);

        List<String> deleteStudents = new ArrayList<>();
        deleteStudents.add("Кира");
        deleteStudents.add("Кирилл");

        boolean containsVioleytta = students.contains("Виолетта");
        System.out.println("containsVioleytta: " + containsVioleytta);
        boolean containsdeleteStudents = students.containsAll(deleteStudents);
        System.out.println("containsdeleteStudents: " + containsdeleteStudents);

        System.out.println("количество students: " + students.size());
        System.out.println("students пустой: " + students.isEmpty());

       students.clear();
       System.out.println(students);

    }
}
