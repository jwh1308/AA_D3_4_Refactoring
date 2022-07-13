package exercise;

public interface TennisGame {
    void wonPoint(Player player);
    String getLiteralScore();
    boolean isEnd();
}