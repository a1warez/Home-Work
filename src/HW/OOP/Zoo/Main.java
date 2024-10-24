package HW.OOP.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Овчарка");
        Animal cat = new Cat("Сиамская кошка");
        Animal bird = new Bird("Колибри", true);

        Animal[] animals = {dog, cat, bird};
        for (Animal a : animals) {
            System.out.print(a + ": ");
            a.makeSound();
            a.eat();
        }

        System.out.println();

        Animal dog1 = new Dog("Хаски");
        System.out.print(dog1 + ": ");
        dog1.makeSound();
        dog1.eat();

        Animal cat1 = new Cat("Мейн-кун");
        System.out.print(cat1 + ": ");
        cat1.makeSound();
        cat1.eat();

        Animal bird1 = new Bird("Радужный лорикет", true);
        System.out.print(bird1 + ": ");
        bird1.makeSound();
        bird1.eat();

    }
}
