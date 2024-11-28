package HW.OOP.HW;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (Integer.compare(o1.getYear(), o2.getYear()) == 0){
            return o1.getName().compareTo( o2.getName());
        }
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
