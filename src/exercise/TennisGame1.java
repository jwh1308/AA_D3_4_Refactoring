public class TennisGame1 implements TennisGame {
	ScoreState score_state;
    private boolean isEnd = false;
    
    public TennisGame1() {
    	score_state = new LoveAll();
    }

	public void changeState(ScoreState score_state) {
    	this.score_state = score_state;
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1") {
        	score_state.wonPlayer1(this);
        }        
        else {
        	score_state.wonPlayer2(this);        	
        }
    }

    public String getLiteralScore() {
    	return score_state.getScore();
    }
    
    public boolean isEnd() {
		return score_state.getScore()=="Win for player1" || score_state.getScore()=="Win for player2";
	}
}
