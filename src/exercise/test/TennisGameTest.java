package exercise.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import exercise.Player;
import exercise.TennisGame;
import exercise.TennisGame1;

class TennisGameTest {

	@Test
	void testCasePlayer1AllWin() {
		System.out.println("=========================testCasePlayer1AllWin========================");
		//TennisGame game = new TennisGame1();
		Player player1 = new Player("leek");
		Player player2 = new Player("lily");
		TennisGame game = new TennisGame1(player1, player2);
	
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-All");
		
		
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Fifteen-Love");
		
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Thirty-Love");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Forty-Love");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Win for player1");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), true);
		System.out.println("=======================================================================");
	}

	
	@Test
	void testCasePlayer2AllWin() {
		System.out.println("=========================testCasePlayer2AllWin========================");
		Player player1 = new Player("leek");
		Player player2 = new Player("lily");
		TennisGame game = new TennisGame1(player1, player2);
	
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-All");
		
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-Fifteen");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-Thirty");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-Forty");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Win for player2");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), true);
		System.out.println("=======================================================================");
	}
	
	@Test
	void testCasePlayerPingPong1() {
		System.out.println("=========================testCasePlayerPingPong1========================");
		Player player1 = new Player("leek");
		Player player2 = new Player("lily");
		TennisGame game = new TennisGame1(player1, player2);
	
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-All");
		
		
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Fifteen-Love");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Fifteen-All");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Thirty-Fifteen");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Thirty-All");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Forty-Thirty");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Deuce");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Advantage player1");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Deuce");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Advantage player1");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Win for player1");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), true);
		System.out.println("=======================================================================");
	}
	

	@Test
	void testCasePlayerPingPong2() {
		System.out.println("=========================testCasePlayerPingPong2========================");
		Player player1 = new Player("leek");
		Player player2 = new Player("lily");
		TennisGame game = new TennisGame1(player1, player2);
	
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-All");
		
		
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Love-Fifteen");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Fifteen-All");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Fifteen-Thirty");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Thirty-All");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Thirty-Forty");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Deuce");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Advantage player2");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player1);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Deuce");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Advantage player2");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), false);
		game.wonPoint(player2);
		System.out.println(game.getLiteralScore());
		assertEquals(game.getLiteralScore(), "Win for player2");
		
		System.out.println(game.isEnd());
		assertEquals(game.isEnd(), true);
		System.out.println("=======================================================================");
	}
}
