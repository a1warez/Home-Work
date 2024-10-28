package HW.OOP.Zoo;

public class Cat extends Animal implements Pet{
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
        System.out.println("Животное издает звук: Кошка мяукает: Мяу");
    }

    @Override
    void move() {
        System.out.println("Кошка ходит на четвереньках");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Кошка ест рыбу");
    }

    @Override
    public void play() {
        System.out.println("Поиграть с кошкой");
    }

    @Override
    public void beFriedly() {
        System.out.println("Демонстрации дружелюбного поведения от кошки");
    }

    @Override
    public String toString() {
        return "Cat{" + "cat='" + cat + '\'' + '}';
    }
}
