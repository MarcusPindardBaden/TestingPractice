package com.qa.MyBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalEntries {
	@Test
	public void nomTest1() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("player wins",18, b.blackjack(18, 16));
	}
	@Test
	public void nomTest2() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer clearly ain't winning",20, b.blackjack(18, 20));
	}
}
