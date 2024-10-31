package HW.OOP.Football;

public class Player {
    String name;
    int stamina;

    static int MAX_STAMINA = 10;
    static int MIN_STAMINA = 0;

    static int maxPlayers = 6;
    static int countPlayers = 0;
    static int freeSeats = 6;


    public Player() {
    }

    public Player(String name, int stamina) {
        if (countPlayers < maxPlayers){
            this.name = name;
            this.stamina = stamina;
            countPlayers++;
            freeSeats--;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (stamina > MIN_STAMINA){
            stamina--;
            System.out.println("Игрок пробежал его стамина составляет: " + stamina);
        }else if (stamina == MIN_STAMINA){
            System.out.println("Игрок выдохся и уходит с поля");
            countPlayers--;
            freeSeats++;
        }
    }

    public void info(){
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + freeSeats + " свободных мест");
        }else if (countPlayers == 6){
            System.out.println("На поле нет свободных мест, " + countPlayers + " игроков в игре");
        }
    }
}
