package exercise;


public class TennisGame1 implements TennisGame {
    private static final String[] scores = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String[] equalScores = {"Love-All", "Fifteen-All", "Thirty-All", "Duce"};
    private Player player1;
    private Player player2;

    public TennisGame1(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(Player wonPlayer) {
        wonPlayer.won();
    }

    private Player getWinner() {
        if (player1.getScore() > player2.getScore()) {
            return player1;
        }
        return player2;
    }

    private Player getLooser() {
        if (player1.getScore() < player2.getScore()) {
            return player1;
        }
        return player2;
    }

    private boolean isScoreEqual() {
        return (player1.getScore() == player2.getScore());
    }

    public String getLiteralScore() {
        Player winner = getWinner();

        if (isScoreEqual())
        {
            if (winner.getScore() >= 4) {
                return "Duce";
            }
            return equalScores[winner.getScore()];
        }
        else if (winner.getScore() >= 4)
        {
            Player looser = getLooser();

            if (winner.getScore() - looser.getScore() == 1) {
                return "Advantage " + winner.getPlayerType();
            } else {
                return "Win for " + winner.getPlayerType();
            }
        }
        return scores[player1.getScore()] + "-" + scores[player2.getScore()];
    }

    public boolean isEnd() {
        Player winner = getWinner();
        Player looser = getLooser();

        if (winner.getScore() >= 4 && winner.getScore() - looser.getScore() > 1)
            return true;
        return false;
    }
}
