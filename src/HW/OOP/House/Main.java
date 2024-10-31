package HW.OOP.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .numberOfRooms(3)
                .numberOfFloors(7)
                .garage(false)
                .build();
        System.out.println(house);

        House house1 = new House.Builder()
                .numberOfFloors(13)
                .numberOfRooms(4)
                .garage(true)
                .build();
        System.out.println(house1);

        House house2 = new House.Builder()
                .numberOfFloors(5)
                .garage(false)
                .build();
        System.out.println(house2);

    }
}
