package exercise;

public interface TennisGame {
    void wonPoint(String playerName);
    String getLiteralScore();
	boolean isEnd();
}