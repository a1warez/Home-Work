package HW.OOP.Football;

import java.util.ArrayList;
import java.util.List;

public class Game{
    static int maxPlayers = 6;
    static int countPlayers = 0;
    static int freeSeats = 6;
    private ArrayList<Player> players = new ArrayList<>();
    String name;


    public void addPlayer(String name) {
        if (countPlayers < maxPlayers){
            countPlayers++;
            freeSeats--;
            Player newPlayer = new Player(name,this);
            players.add(newPlayer);
            System.out.println("Введен новый игрок, " + name + " всего - " + countPlayers);
        }else {
            System.out.println("Игроков уже 6, мест нет");
        }
    }

    public void info(){
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + freeSeats + " свободных мест");
        }else if (countPlayers == 6){
            System.out.println("На поле нет свободных мест, " + countPlayers + " игроков в игре");
        }
    }


    public List<Player> getPlayer(){
        return players;
    }
    public void checkName(String name) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(name)) {
                System.out.println("Игрок " + name + " есть в списке.");
                break;
            } else {
                System.out.println("Игрока с именем " + name + " нет в списке.");
            }
        }
    }
}
