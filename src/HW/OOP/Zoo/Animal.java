package HW.OOP.Zoo;

public abstract class Animal implements Pet{
    String name;


    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

   abstract void makeSound();

    abstract void move();


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
