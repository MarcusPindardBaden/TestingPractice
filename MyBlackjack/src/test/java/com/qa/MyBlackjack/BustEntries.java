package com.qa.MyBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BustEntries {
	@Test
	public void testy8() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("player wins",18, b.blackjack(18, 23));
	}
	@Test
	public void testy11() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer wins",20, b.blackjack(22, 20));
	}
	@Test
	public void testy12() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("neither wins",0, b.blackjack(22, 22));
	}

}
