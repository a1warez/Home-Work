package HW.OOP.Zoo;

public class Cat extends Animal {
    String cat;

    public Cat(String cat) {
        this.cat = cat;
    }

    public Cat(String name, String cat) {
        super(name);
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Кошка мяукает: Мяу");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Кошка ест рыбу");
    }

    @Override
    public String toString() {
        return "Cat{" + "cat='" + cat + '\'' + '}';
    }
}
