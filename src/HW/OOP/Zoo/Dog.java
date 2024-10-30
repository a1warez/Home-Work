package HW.OOP.Zoo;

public final class Dog extends Animal implements Pet {
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
        System.out.println("Животное издает звук: Собака лает: Гав-гав");
    }

    @Override
    void move() {
        System.out.println("Собака ходит на четвереньках");
    }

    @Override
    public void play() {
        System.out.println("Поиграть с собакой");
    }

    @Override
    public void beFriedly() {
        System.out.println("Демонстрации дружелюбного поведения от собаки");
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
