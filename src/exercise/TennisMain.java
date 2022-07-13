package exercise;
import java.util.Random;

public class TennisMain {

    public static void main(String[] args) {

        Player player1 = new Player("leek");
        Player player2 = new Player("lily");

        TennisGame1 game = new TennisGame1(player1, player2);
        playGame(game, player1, player2);

    }

    public static void playGame(TennisGame tennisGame, Player player1, Player player2) {

        Random random = new Random();

        while(!tennisGame.isEnd()) {
            if(random.nextBoolean()) {
                tennisGame.wonPoint(player1);
            } else {
                tennisGame.wonPoint(player2);
            }
            System.out.println(tennisGame.getLiteralScore());
        }
    }
}
