package HW.OOP.Football;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("p1",8);
        Player player2 = new Player("p2",8);
        Player player3 = new Player("p3",10);
        Player player4 = new Player("p4",8);
        Player player5 = new Player("p5",9);
        Player player6 = new Player("p6", 9);
        player6.info();

        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();

        player6.info();

    }
}
