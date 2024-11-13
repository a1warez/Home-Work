package HW.OOP.List;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Metods {

    List<String> students = new ArrayList<>();
    static Random random = new Random();
    String name;
    public static long addNumbers(List<Integer> list){
        LocalTime start = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        LocalTime stop = LocalTime.now();
        Duration time = Duration.between(start, stop);
        long duration = time.toMillis();
        return duration;
    }
    public static long random(List<Integer> list){
        LocalTime start = LocalTime.now();
        Integer i;
        for (int j = 0; j < 100000; j++) {
            i = list.get(random.nextInt(0,100000));
        }

        LocalTime stop = LocalTime.now();
        Duration time = Duration.between(start, stop);
        long duration1 = time.toMillis();
        return duration1;
    }
}
