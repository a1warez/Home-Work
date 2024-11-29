package HW.OOP.HW.Immutable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomMutableClass customMutableClass = new CustomMutableClass(10);
        CustomMutableClass customMutable = new CustomMutableClass(5);
        CustomMutableClass custom = new CustomMutableClass(7);
        CustomMutableClass custom1 = new CustomMutableClass(3);
        ImmutableClass o1 = new ImmutableClass("1", List.of(1), customMutableClass);
        ImmutableClass o2 = new ImmutableClass("2", List.of(2), customMutableClass);
        ImmutableClass o3 = new ImmutableClass("3", List.of(3), customMutableClass);
        ImmutableClass o4 = new ImmutableClass("4", List.of(4), customMutableClass);
        System.out.println(o1);

        customMutableClass.setValue(5);
        System.out.println(o1);
        System.out.println(customMutableClass.getValue());

        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(o1, "value1");
        map.put(o2, "value2");
        map.put(o3, "value3");
        map.put(o4, "value4");
        System.out.println(map);

    }
}
