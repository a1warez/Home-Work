package HW.OOP.Task;

import java.util.Objects;

public class Task implements Comparable<Task> {
    String name;
    Integer priority;
    String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(priority, task.priority)
                && Objects.equals(name, task.name)
                && Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority, category);
    }
    public int compareTo(Task o){
       if (this.priority.compareTo(o.priority) == 0){
           if (this.category.compareTo(o.category) == 0){

           }else {
              return this.category.compareTo(o.category);
           }
       }else {
           return this.priority.compareTo(o.priority);
       }
       return 0;
    }

    @Override
    public String toString() {
        return "Task{" + "name='" + name + '\'' +
                ", priority=" + priority +
                ", category='" + category + '\'' + '}';
    }

}
