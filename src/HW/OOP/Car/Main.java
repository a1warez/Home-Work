package HW.OOP.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lada",2024,"Black");
        Car car1 = new Car("Lada",2024,"White");
        Car car2 = new Car("Lada",2024,"Red");
        Car car3 = new Car("Lada",2023,"Gray");
        Car car4 = new Car("Volga",2024,"Black");
        Car car5 = new Car("Volga",2023,"White");
        Car car6 = new Car("Volga",2022,"Red");
        Car car7 = new Car("Audi",2020,"Red");

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        Collections.sort(cars);
        for (Car carr : cars){
            System.out.println(carr);
        }

    }
}
