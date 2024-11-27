package HW.OOP.Task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Task1",2,"Bug");
        Task task2 = new Task("Task2",3,"Feature");
        Task task3 = new Task("Task3",1,"Documentation");
        Task task4 = new Task("Task4",2,"Aparat");
        Task task5 = new Task("Task5",1,"faz");

        Queue<Task> queue = new PriorityQueue<>();
        queue.add(task1);
        queue.add(task2);
        queue.add(task3);
        queue.add(task4);
        queue.add(task5);

        int o = queue.size();
        for (int i = 0; i < o; i++) {
            System.out.println(queue.poll());
        }


    }
}
