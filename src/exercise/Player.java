package exercise;

public class Player {
    public static class PlayerGroup {
        public static final PlayerGroup PLAYER1 = new PlayerGroup("Player 1");
        public static final PlayerGroup PLAYER2 = new PlayerGroup("Player 2");

        private final String playerGroup;
        private PlayerGroup(String playerGroup) {
            this.playerGroup = playerGroup;
        }
        @Override
        public String toString() {
            return playerGroup;
        }
    }

    private int score;
    private String name;
    private PlayerGroup playerGroup;

    public Player(String name, PlayerGroup playerGroup) {
        this.name = name;
        this.playerGroup = playerGroup;
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
        return playerGroup.toString();
    }
}