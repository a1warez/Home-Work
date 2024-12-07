package HW.OOP.HW.Exception;

import java.util.List;
import java.util.Objects;

public class ListCar {
    private String name;

    public ListCar() {
    }

    public ListCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListCar listCar = (ListCar) o;
        return Objects.equals(name, listCar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "ListCar{" + "name='" + name + '\'' + '}';
    }
    public static ListCar getCar(List<ListCar> o, Object car) throws CarNotFountException {
        ListCar listCar;
        try {
            for (int i = 0; i < o.size(); i++) {
                listCar = o.get(i);
                if (listCar.equals(car)) {
                    return listCar;
                }
            }
            throw new CarNotFountException();
        } catch (CarNotFountException exception) {
            System.out.println("Машина с параметрами как вы искали машину в списке не найдена: " + exception.getMessage());
            throw new CarNotFountException();
        }

    }
}
