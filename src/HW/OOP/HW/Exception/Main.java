package HW.OOP.HW.Exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(metodException.delenie(10, 2));

        List<ListCar> cars = new ArrayList<>();
        ListCar car1 = new ListCar("Lada");
        ListCar car2 = new ListCar("Volga");
        ListCar car3 = new ListCar("Audi");
        ListCar car4 = new ListCar("BMW");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        ListCar test = new ListCar("Audi");

        while (true){
           try {
                System.out.println(ListCar.getCar(cars, test));
           }catch (CarNotFountException o){
                System.out.println(o.getMessage());
           }
            break;
       }
        List<String> passwords = new ArrayList<>();
        String s1 = "MyPassword123";
        String s2 = "ffffff66";
        String s3 = "ShlechtPass";
        String s4 = "aSdf3h";
        String s5 = "avalanche gt2020";
        passwords.add(s1);
        passwords.add(s2);
        passwords.add(s3);
        passwords.add(s4);
        passwords.add(s5);

        String[] passwords1 = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};
        System.out.println(metodException.checkPasswords(passwords1));

    }
}
