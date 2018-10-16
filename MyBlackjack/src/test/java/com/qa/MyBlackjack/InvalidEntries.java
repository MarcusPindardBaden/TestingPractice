package com.qa.MyBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvalidEntries {
	
	@Test
	public void testy() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("both invalid",0, b.blackjack(-3, 0));
	}
	@Test
	public void testy2() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("player invalid",0, b.blackjack(-3, 20));
	}
	@Test
	public void testy3() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("player invalid",0, b.blackjack(-3, 23));
	}
	@Test
	public void testy4() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("both invalid",0, b.blackjack(-3, 33));
	}
		
		//player has valid score within range
	@Test
	public void testy5() 
	{
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer invalid",0, b.blackjack(18, 0));
	}
	@Test
	public void testy6() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer invalid",0, b.blackjack(18, 33));
	}
	@Test
	public void testy7() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer invalid",0, b.blackjack(22, 0));
	}
	@Test
	public void testy8() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("dealer invalid",0, b.blackjack(22, 32));
	}
	@Test
	public void testy9() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("both invalid",0, b.blackjack(32, 0));
	}
	@Test
	public void testy10() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("player invalid",0, b.blackjack(32, 20));
	}
	@Test
	public void testy11() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("player invalid",0, b.blackjack(32, 22));
	}
	@Test
	public void testy12() {
		BlackjackGame b = new BlackjackGame();
		assertEquals("both invalid",0, b.blackjack(32, 32));
	}

}
