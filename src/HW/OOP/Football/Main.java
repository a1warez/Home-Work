package HW.OOP.Football;

public class Main {
   public static void main(String[] args) {
      Game game = new Game();

      System.out.println(game.getPlayer());

      game.addPlayer("Player1");
      game.addPlayer("Player2");
      game.addPlayer("Player3");
      System.out.println();

      game.info();

      System.out.println();
      game.addPlayer("Player4");
      game.addPlayer("Player5");
      game.addPlayer("Player6");
      game.addPlayer("Player7");
      game.info();
      System.out.println();
      System.out.println(game.getPlayer());
      System.out.println();
      game.checkName("Player3");
      System.out.println();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();
      game.getPlayer().get(1).run();





   }

}