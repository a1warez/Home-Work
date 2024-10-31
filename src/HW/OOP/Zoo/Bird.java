package HW.OOP.Zoo;

public class Bird extends Animal implements Pet{
    String bird;
    boolean canFly;

    public Bird() {

    }

    public Bird(String bird, boolean canFly) {
        this.bird = bird;
        this.canFly = canFly;
    }

    public Bird(String name, String bird) {
        super(name);
        this.bird = bird;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    void makeSound() {
        System.out.println("Животное издает звук: Птица чирикает: Чирик-чирик");
    }

    @Override
    void move() {
        if (canFly == true){
            System.out.println("Птица умеет летает");
        }else if (canFly == false){
            System.out.println("Птица не умеет летает");
        }
    }

    public void canFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Птица ест семена");
    }

    @Override
    public void play() {
        System.out.println("Не поиграть, не домашнее животное");
    }

    @Override
    public void beFriedly() {
        System.out.println("Не пойдет, не домашнее животное");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "bird='" + bird + '\'' + "canFly=" + canFly + " " + '}';
    }
}
