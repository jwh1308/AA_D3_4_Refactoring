package exercise;


public class TennisGame1 implements TennisGame {
	ScoreState score_state;
    private Player player1;
    private Player player2;

    public TennisGame1(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    	score_state = new LoveAll();
    }

    public void wonPoint(Player wonPlayer) {
        wonPlayer.won();
        if (wonPlayer == this.player1)	
        	score_state.wonPlayer1(this);
        else 
        	score_state.wonPlayer2(this);
    }

    public String getLiteralScore() 
    	return score_state.getScore();
    }
    
    public boolean isEnd() {
		return score_state.getScore()=="Win for player1" || score_state.getScore()=="Win for player2";
	}
}
