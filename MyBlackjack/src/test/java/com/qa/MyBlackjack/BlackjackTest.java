package com.qa.MyBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;

public class BlackjackTest {
	static int x = 1;
	@BeforeClass
	public static void Initial() {
		System.out.println("Welcome to THE TEST");
	}
	@Before
	public void setup() {
		System.out.println("Test" + x + "/17");
	}
		//tests where player is invalid below
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
		public void testy6() 
		{
			BlackjackGame b = new BlackjackGame();
			assertEquals("player wins",18, b.blackjack(18, 16));
		}
		@Test
		public void testy7() 
		{
			BlackjackGame b = new BlackjackGame();
			assertEquals("dealer wins",20, b.blackjack(18, 20));
		}
		@Test
		public void testy8() 
		{
			BlackjackGame b = new BlackjackGame();
			assertEquals("player wins",18, b.blackjack(18, 23));
		}
		@Test
		public void testy9() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("dealer invalid",0, b.blackjack(18, 33));
		}
			
			//player has valid score out of range
		@Test
		public void testy10() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("dealer invalid",0, b.blackjack(22, 0));
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
		@Test
		public void testy13() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("dealer invalid",0, b.blackjack(22, 32));
		}
			
			//player has invalid score above
		@Test
		public void testy14() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("both invalid",0, b.blackjack(32, 0));
		}
		@Test
		public void testy15() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("player invalid",0, b.blackjack(32, 20));
		}
		@Test
		public void testy16() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("player invalid",0, b.blackjack(32, 22));
		}
		@Test
		public void testy17() {
			BlackjackGame b = new BlackjackGame();
			assertEquals("both invalid",0, b.blackjack(32, 32));
		}
	@After
	public void tearDown() {
		System.out.println("Test" + x + "/17 finished");
		x++;
	}
	@AfterClass
	public static void End() {
		System.out.println("TEST COMPLETE");
	}
	
}
