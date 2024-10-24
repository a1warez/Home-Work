package HW.OOP.Zoo;

public class Dog extends Animal {
    String dog;

    public Dog(String dog) {
        this.dog = dog;
    }

    public Dog(String name, String dog) {
        super(name);
        this.dog = dog;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Собака лает: Гав-гав");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Собака ест кость");
    }

    @Override
    public String toString() {
        return "Dog{" + "dog='" + dog + '\'' + '}';
    }
}
