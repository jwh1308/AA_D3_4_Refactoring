package exercise;

public class Player {
    public static class PlayerGroup {
        public static final PlayerGroup PLAYER1 = new PlayerGroup(0);
        public static final PlayerGroup PLAYER2 = new PlayerGroup(1);

        private final int playerType;
        private PlayerGroup(int playerType) {
            this.playerType = playerType;
        }
    }

    private int score;
    private String name;
    private PlayerGroup playerGroup;

    public Player(String name, PlayerGroup playerGroup) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void won() {
        score += 1;
    }

    public String getName() {
        return name;
    }
    public String getPlayerType() {
        if (playerGroup == PlayerGroup.PLAYER1)
            return "Player 1";
        return "Player 2";
    }
}
