interface ScoreState {
	public String getScore();
	public void wonPlayer1(TennisGame1 tennis_game);
	public void wonPlayer2(TennisGame1 tennis_game);
}

class LoveAll implements ScoreState { // 0-0
	String state_name = "Love-All";
	static LoveAll instance;
	private LoveAll() {};
	public static LoveAll getInstance() {
		if (instance == null) {
			instance = new LoveAll();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenLove()); }
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveFifteen()); }
	public String getScore() { return state_name; }	
}

class FifteenLove implements ScoreState { // 1-0
	String state_name = "Fifteen-Love";
	static FifteenLove instance;
	private FifteenLove() {};
	public static FifteenLove getInstance() {
		if (instance == null) {
			instance = new FifteenLove();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyLove()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenAll()); };
	public String getScore() { return state_name; }	
}

class LoveFifteen implements ScoreState { // 0-1
	String state_name = "Love-Fifteen";
	static LoveFifteen instance;
	private LoveFifteen() {};
	public static LoveFifteen getInstance() {
		if (instance == null) {
			instance = new LoveFifteen();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenAll()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveThirty()); };
	public String getScore() { return state_name; }	
}

class ThirtyLove implements ScoreState { // 2-0
	String state_name = "Thirty-Love";
	static ThirtyLove instance;
	private ThirtyLove() {};
	public static ThirtyLove getInstance() {
		if (instance == null) {
			instance = new ThirtyLove();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyLove()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyFifteen()); };
	public String getScore() { return state_name; }	
}

class FifteenAll implements ScoreState { // 1-1
	String state_name = "Fifteen-All";
	static FifteenAll instance;
	private FifteenAll() {};
	public static FifteenAll getInstance() {
		if (instance == null) {
			instance = new FifteenAll();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyFifteen()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenThirty()); };
	public String getScore() { return state_name; }	
}

class LoveThirty implements ScoreState { // 0-2
	String state_name = "Love-Thirty";
	static LoveThirty instance;
	private LoveThirty() {};
	public static LoveThirty getInstance() {
		if (instance == null) {
			instance = new LoveThirty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new LoveForty()); };
	public String getScore() { return state_name; }	
}

class FortyLove implements ScoreState { //  3-0
	String state_name = "Forty-Love";
	static FortyLove instance;
	private FortyLove() {};
	public static FortyLove getInstance() {
		if (instance == null) {
			instance = new FortyLove();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FortyFifteen()); };
	public String getScore() { return state_name; }	
}

class ThirtyFifteen implements ScoreState { // 2-1
	String state_name = "Thirty-Fifteen";
	static ThirtyFifteen instance;
	private ThirtyFifteen() {};
	public static ThirtyFifteen getInstance() {
		if (instance == null) {
			instance = new ThirtyFifteen();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyFifteen()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyThirty()); };
	public String getScore() { return state_name; }	
}

class FifteenThirty implements ScoreState { // 1-2
	String state_name = "Fifteen-Thirty";
	static FifteenThirty instance;
	private FifteenThirty() {};
	public static FifteenThirty getInstance() {
		if (instance == null) {
			instance = new FifteenThirty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenForty()); };
	public String getScore() { return state_name; }	
}

class LoveForty implements ScoreState { // 0-3
	String state_name = "Love-Forty";
	static LoveForty instance;
	private LoveForty() {};
	public static LoveForty getInstance() {
		if (instance == null) {
			instance = new LoveForty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FifteenForty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class FortyFifteen implements ScoreState { //  3-1
	String state_name = "Forty-Fifteen";
	static FortyFifteen instance;
	private FortyFifteen() {};
	public static FortyFifteen getInstance() {
		if (instance == null) {
			instance = new FortyFifteen();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player1()); };
	public String getScore() { return state_name; }	
}

class ThirtyThirty implements ScoreState { // 2-2
	String state_name = "Thirty-Thirty";
	static ThirtyThirty instance;
	private ThirtyThirty() {};
	public static ThirtyThirty getInstance() {
		if (instance == null) {
			instance = new ThirtyThirty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new FortyThirty()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new ThirtyForty()); };
	public String getScore() { return state_name; }	
}

class FifteenForty implements ScoreState { // 1-3
	String state_name = "Fifteen-Forty";
	static FifteenForty instance;
	private FifteenForty() {};
	public static FifteenForty getInstance() {
		if (instance == null) {
			instance = new FifteenForty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player2()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class FortyThirty implements ScoreState { // 3-2
	String state_name = "Forty-Thirty";
	static FortyThirty instance;
	private FortyThirty() {};
	public static FortyThirty getInstance() {
		if (instance == null) {
			instance = new FortyThirty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public String getScore() { return state_name; }	
}

class ThirtyForty implements ScoreState { // 2-3
	String state_name = "Thirty-Forty";
	static ThirtyForty instance;
	private ThirtyForty() {};
	public static ThirtyForty getInstance() {
		if (instance == null) {
			instance = new ThirtyForty();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class Deuce implements ScoreState { // 3-3 Deuce
	String state_name = "Deuce";
	static Deuce instance;
	private Deuce() {};
	public static Deuce getInstance() {
		if (instance == null) {
			instance = new Deuce();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Advantage_player2()); };
	public String getScore() { return state_name; }	
}

class Advantage_player1 implements ScoreState { // Advantage player1
	String state_name = "Advantage player1";
	static Advantage_player1 instance;
	private Advantage_player1() {};
	public static Advantage_player1 getInstance() {
		if (instance == null) {
			instance = new Advantage_player1();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public String getScore() { return state_name; }	
}

class Advantage_player2 implements ScoreState { // Advantage player2
	String state_name = "Advantage player2";
	static Advantage_player2 instance;
	private Advantage_player2() {};
	public static Advantage_player2 getInstance() {
		if (instance == null) {
			instance = new Advantage_player2();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new Deuce()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}

class WinForPlayer1 implements ScoreState { // Win for player1
	String state_name = "Win for player1";
	static WinForPlayer1 instance;
	private WinForPlayer1() {};
	public static WinForPlayer1 getInstance() {
		if (instance == null) {
			instance = new WinForPlayer1();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer1()); };
	public String getScore() { return state_name; }	
}

class WinForPlayer2 implements ScoreState { // Win for player2
	String state_name = "Win for player2";
	static WinForPlayer2 instance;
	private WinForPlayer2() {};
	public static WinForPlayer2 getInstance() {
		if (instance == null) {
			instance = new WinForPlayer2();
		}
		return instance;
	}
	public void wonPlayer1(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public void wonPlayer2(TennisGame1 tennis_game) { tennis_game.changeState(new WinForPlayer2()); };
	public String getScore() { return state_name; }	
}
