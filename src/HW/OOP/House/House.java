package HW.OOP.House;

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

