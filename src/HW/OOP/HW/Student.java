package HW.OOP.HW;

public class Student implements Comparable<Student>{
    private String name;
    private Integer year;

    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
