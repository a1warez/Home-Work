package HW.OOP.Football;


import java.util.Random;

public class Player {
    private final Game game;
    private int stamina;
    Random random = new Random();
    private final String name;

    static int MAX_STAMINA = 10;
    static int MIN_STAMINA = 0;

    public Player(String name,Game game) {
        this.stamina = random.nextInt(8, MAX_STAMINA + 1);
        this.name = name;
        this.game = game;
    }


    public int getStamina() {
        return stamina;
    }
    public String getName() {
        return name;
    }
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println("Игрок по имени " + name + " пробежал его стамина составляет: " + stamina);
        } else if (stamina == MIN_STAMINA) {
            System.out.println("Игрок выдохся и уходит с поля");
        }
    }
    public static Integer getMaxStamina() {
        return MAX_STAMINA;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                '}';
    }

}
