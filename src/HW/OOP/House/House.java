package HW.OOP.House;


import java.util.Objects;

public class House {


public class House {

    private int numberOfFloors;
    private int numberOfRooms;
    private boolean garage;

    private House(Builder builder) {
        this.numberOfFloors = builder.numberOfFloors;
        this.numberOfRooms = builder.numberOfRooms;
        this.garage = builder.garage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors
                && numberOfRooms == house.numberOfRooms
                && garage == house.garage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFloors, numberOfRooms, garage);
    }

 master

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", numberOfRooms=" + numberOfRooms +
                ", garage=" + garage +
                '}';
    }

    public static class Builder {
        private int numberOfFloors;
        private int numberOfRooms;
        private boolean garage;

        public Builder() {
        }


        public Builder() {

        }

        public Builder numberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public Builder numberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder garage(boolean garage) {
            this.garage = garage;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "numberOfFloors=" + numberOfFloors +
                    ", numberOfRooms=" + numberOfRooms +
                    ", garage=" + garage +
                    '}';
        }

        public House build() {
            return new House(this);
        }
    }
}

