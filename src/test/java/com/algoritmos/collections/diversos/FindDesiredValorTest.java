package com.algoritmos.collections.diversos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.desafios.FindDesiredValor;

public class FindDesiredValorTest {

	@Test
	public void shouldReturn9() {
		
		Integer[] array = new Integer[4];
		
		array[0] = 8;
		array[1] = 9;
		array[2] = 10;
		array[3] = 9;
		
		int expectedValue = 9;
		int whatBigger = 2;
		
		
		int response = FindDesiredValor.findBiggerNumber(array, whatBigger);
		
		
		assertEquals(expectedValue, response);
		
	}
	
	@Test
	public void shouldReturnMinus1() {
		
		Integer[] array = new Integer[1];
		
		array[0] = 10;

		
		int expectedValue = -1;
		int whatBigger = 2;
		
		
		int response = FindDesiredValor.findBiggerNumber(array, whatBigger);
		
		
		assertEquals(expectedValue, response);
		
	}
	
	
	@Test
	public void shouldReturn20() {
		
		Integer[] array = new Integer[10];
		
		array[0] = 8;
		array[1] = 9;
		array[2] = 10;
		array[3] = 11;
		array[4] = 12;
		array[5] = 13;
		array[6] = 13;
		array[7] = 16;
		array[8] = 20;
		array[9] = 21;
		
		int expectedValue = 20;
		int whatBigger = 2;
		
		
		int response = FindDesiredValor.findBiggerNumber(array, whatBigger);
		
		
		assertEquals(expectedValue, response);
		
	}

}
