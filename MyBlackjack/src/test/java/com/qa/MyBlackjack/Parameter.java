package com.qa.MyBlackjack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parameter{
	BlackjackGame b = new BlackjackGame();
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][] {{0,-3,0},{18,18,16},{20,18,20},{0,22,32}});
	}
	
	private int intPut1;
	private int intPut2;
	private int intPected;

		//@Parameter//first data value (0) is default
	//public/* Not private */ int finput;
	//@Parameter(1)
	//public/* NOT private */ int fExpected;
	
	public Parameter(int expected, int input1, int input2) {
		intPut1 =  input1;
		intPut2 = input2;
		intPected = expected;
	}
	@Test
	public void test() {
		assertEquals(intPected, b.blackjack(intPut1, intPut2));
	}
}
