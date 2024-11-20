package HW.OOP.Car;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String model;
    private Integer year;
    private String color;


    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color);
    }

    @Override
    public int compareTo(Car o) {
        if (this.model.compareTo(o.model) == 0){
            if (Integer.compare(o.year, this.year) == 0){
                if (this.color.compareTo(o.color) == 0){

                }else {
                   return this.color.compareTo(o.color);
                }

            }else {
                return Integer.compare(o.year, this.year);
            }
        }else {
            return this.model.compareTo(o.model);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
