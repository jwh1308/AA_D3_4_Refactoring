interface ScoreState {
	public String getScore();
	public void wonPlayer1(TennisGame1 tennis_game);
	public void wonPlayer2(TennisGame1 tennis_game);
}

class LoveAll implements ScoreState { // 0-0
	String state_name = "Love-All";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenLove()); }
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveFifteen()); }
	public String getScore() { return state_name; }	
}

class FifteenLove implements ScoreState { // 1-0
	String state_name = "Fifteen-Love";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyLove()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenAll()); };
	public String getScore() { return state_name; }	
}

class LoveFifteen implements ScoreState { // 0-1
	String state_name = "Love-Fifteen";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenAll()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveThirty()); };
	public String getScore() { return state_name; }	
}

class ThirtyLove implements ScoreState { // 2-0
	String state_name = "Thirty-Love";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyLove()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyFifteen()); };
	public String getScore() { return state_name; }	
}

class FifteenAll implements ScoreState { // 1-1
	String state_name = "Fifteen-All";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyFifteen()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenThirty()); };
	public String getScore() { return state_name; }	
}

class LoveThirty implements ScoreState { // 0-2
	String state_name = "Love-Thirty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveForty()); };
	public String getScore() { return state_name; }	
}

class FortyLove implements ScoreState { //  3-0
	String state_name = "Forty-Love";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FortyFifteen()); };
	public String getScore() { return state_name; }	
}

class ThirtyFifteen implements ScoreState { // 2-1
	String state_name = "Thirty-Fifteen";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyFifteen()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyThirty()); };
	public String getScore() { return state_name; }	
}

class FifteenThirty implements ScoreState { // 1-2
	String state_name = "Fifteen-Thirty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenForty()); };
	public String getScore() { return state_name; }	
}

class LoveForty implements ScoreState { // 0-3
	String state_name = "Love-Forty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenForty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class FortyFifteen implements ScoreState { //  3-1
	String state_name = "Forty-Fifteen";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player1()); };
	public String getScore() { return state_name; }	
}

class ThirtyThirty implements ScoreState { // 2-2
	String state_name = "Thirty-Thirty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyForty()); };
	public String getScore() { return state_name; }	
}

class FifteenForty implements ScoreState { // 1-3
	String state_name = "Fifteen-Forty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player2()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class FortyThirty implements ScoreState { // 3-2
	String state_name = "Forty-Thirty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public String getScore() { return state_name; }	
}

class ThirtyForty implements ScoreState { // 2-3
	String state_name = "Thirty-Forty";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class Deuce implements ScoreState { // 3-3 Deuce
	String state_name = "Deuce";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player2()); };
	public String getScore() { return state_name; }	
}

class Advantage_player1 implements ScoreState { // Advantage player1
	String state_name = "Advantage player1";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public String getScore() { return state_name; }	
}

class Advantage_player2 implements ScoreState { // Advantage player2
	String state_name = "Advantage player2";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class WinForPlayer1 implements ScoreState { // Win for player1
	String state_name = "Win for player1";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public String getScore() { return state_name; }	
}

class WinForPlayer2 implements ScoreState { // Win for player2
	String state_name = "Win for player2";
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}
