package HW.OOP.HW.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMetod {
    public static Set<Integer> getIntegerUniqueElements(int[] arr){
        Set<Integer> num = new HashSet<>();
        for (Integer numbers : arr){
            num.add(numbers);
        }
        return num;
    }

    public static Set<String> getStringUniqueElements(String[] arr){
        Set<String> stringSet = new LinkedHashSet<>();
        for (String s : arr){
            stringSet.add(s);
        }
        return stringSet;
    }
    public static Integer[] findClosestNumbers(Integer[] arr, int target){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer numbers : arr){
            treeSet.add(numbers);
        }
        Integer lower = treeSet.lower(target);
        Integer higher = treeSet.higher(target);
        Integer[] result = {lower, higher};
        return result;
    }

}
