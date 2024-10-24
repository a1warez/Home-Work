package HW.OOP.Zoo;

public class Bird extends Animal {
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
        super.makeSound();
        System.out.println("Птица чирикает: Чирик-чирик");
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
    public String toString() {
        return "Bird{" +
                "bird='" + bird + '\'' + "canFly=" + canFly + " " + '}';
    }
}
