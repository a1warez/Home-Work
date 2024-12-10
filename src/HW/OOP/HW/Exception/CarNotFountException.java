package HW.OOP.HW.Exception;

public class CarNotFountException extends RuntimeException{
    private ListCar name;

    public ListCar getName() {
        return name;
    }

    public CarNotFountException() {
    }

    public CarNotFountException(String message, ListCar car) {
        super(message);
        name=car;
    }
}
