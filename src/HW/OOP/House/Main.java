package HW.OOP.House;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .numberOfFloors(4)
                .numberOfRooms(2)
                .garage(false)
                .build();
        System.out.println(house);
        House house1 = new House.Builder()
                .numberOfFloors(13)
                .garage(true)
                .build();
        System.out.println(house1);
        House house2 = new House.Builder()
                .numberOfFloors(9)
                .numberOfRooms(3)
                .build();
        System.out.println(house2);
        House house3 = new House.Builder()
                .numberOfFloors(4)
                .numberOfRooms(2)
                .garage(false)
                .build();
        System.out.println(house3);

        List<House> houses = new ArrayList<>();
        houses.add(house);
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        System.out.println(houses);

        System.out.println(houses.contains(house));
        System.out.println(houses.contains(house1));

        System.out.println(houses.indexOf(house2));
        System.out.println(houses.indexOf(house3));

        System.out.println(house.hashCode());
        System.out.println(house3.hashCode());
        System.out.println(house.equals(house3));


    }
}
