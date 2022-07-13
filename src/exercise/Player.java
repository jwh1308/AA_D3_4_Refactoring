package exercise;

public class Player {
    private int score;
    private String name;

    public Player(String name) {
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
}
