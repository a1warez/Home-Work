package HW.OOP.Zoo;

public class Animal {
    String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.print("Животное издает звук: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eat() {
        System.out.print("Животное едят: ");
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + '}';
    }
}
