package com.usaa.monopoly.web;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameStateTest {
	GameController game;
	GameState gs;
	@Before
	public void setUp() throws Exception {
		game = new GameController();
		gs = new GameState();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGameStateFillsBoard() {
		gs.fillGameColors(game.getBoard());
		for(int i = 0; i < 40; i++) {
			System.out.println(gs.boardColors.get(i));
		}
	}
	
	@Test
	public void testGameStateFillsBoardWithColorsAfterPlay() {
		game.playGame(50);
		gs.fillGameColors(game.getBoard());
		for(int i = 0; i < 40; i++) {
			System.out.println(gs.boardColors.get(i));
		}
	}

}
