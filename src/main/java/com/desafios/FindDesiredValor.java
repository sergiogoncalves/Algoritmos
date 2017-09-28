/*
 * 
 * Este algoritmo é feito para encontrar em um array qual é o primeiro ou segundo ou terceiro
 * maior valor
 * 
 * O treeset só aceita itens únicos e os ordena, nesse caso eu ordenei de tras pra frente
 */
package com.desafios;

import java.util.Arrays;
import java.util.TreeSet;

public class FindDesiredValor {

	public static int findBiggerNumber(Integer[] array, int whatBigger) {
		
		if (array.length == 0 ) return -1;
		
		TreeSet<Integer> uniqueItems = (TreeSet<Integer>) new TreeSet<Integer>(Arrays.asList(array)).descendingSet();
		
		array = uniqueItems.toArray(new Integer[uniqueItems.size()]);
		
		if (array.length < whatBigger )	return -1;
				
		if (whatBigger <= 0) return -1;
		
		return array[whatBigger - 1];
	}

}
