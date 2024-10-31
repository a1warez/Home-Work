package HW.OOP.Zoo;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Овчарка");
        Pet cat = new Cat("Сиамская кошка");
        Pet bird = new Bird("Колибри", true);

       Pet[] pet = {dog, cat, bird};
        for (Pet a : pet) {
            if (dog instanceof Pet){
                if (cat instanceof Pet){
                    if (bird instanceof Pet){
                        System.out.print(a + ": ");
                        a.play();
                        a.beFriedly();
                        System.out.println();
                    }
                }

            }
        }

        System.out.println();

        Animal dog1 = new Dog("Хаски");
        System.out.print(dog1 + ": ");
        dog1.makeSound();
        dog1.eat();
        dog1.move();

        Animal cat1 = new Cat("Мейн-кун");
        System.out.print(cat1 + ": ");
        cat1.makeSound();
        cat1.eat();
        cat1.move();

        Animal bird1 = new Bird("Пингвин", false);
        System.out.print(bird1 + ": ");
        bird1.makeSound();
        bird1.eat();
        bird1.move();
    }
}
