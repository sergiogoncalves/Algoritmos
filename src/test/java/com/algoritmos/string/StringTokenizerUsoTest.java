package com.algoritmos.string;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringTokenizerUsoTest {

	@Test
	public void testPrintTokens() {
		StringTokenizerUso.printTokens("Sérgio Corrêa Gonçalves");
	}
	
	@Test
	public void shouldReturnQuantityTokens() {
		
		String string = "Sérgio Corrêa Gonçalves";
		int expected = 3;
		int actual = StringTokenizerUso.getQuantidadeTokens(string);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnQuantityTokensWithLimiters() {
		
		String string = "Sérgio = Corrêa = Gonçalves";
		String limiter = "=";
		int expected = 3;
		int actual = StringTokenizerUso.getQuantidadeTokensComLimitador(string, limiter);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnQuantityTokensWithLimiters02() {
		
		String string = "Sérgio =  = Gonçalves";
		String limiter = "=";
		int expected = 2;
		int actual = StringTokenizerUso.getQuantidadeTokensComLimitador(string, limiter);
		
		assertNotEquals(expected, actual);
	}

}
