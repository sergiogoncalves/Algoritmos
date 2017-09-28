/* AINDA FALTA TERMINAR
 * 
 * Este algoritmo é utilizado para comparar duas strings e verificar se são iguais, se são anagramas e se não forem
 * quantas palavras precisam ser alteradas pra virar um anagrama. Também compara se são do mesmo tamanho.
 */

package com.desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class QuantidadeAlteracoesNecessariasParaAcharUmAnagrama {
	
    public static int[] getMinimumDifference(String[] a, String[] b) {
    	
    	int[] retorno = new int[a.length - 1];
    	int counter = 0;
    	int counter2 = 0;
    	
    	for (int i = 1; i < b.length; i++) {
			
    		if (a[i].length() != b[i].length()) {
				
				retorno[(i-1)] = -1;
				continue;
			}
    		
    		char [] ArrayA = a[i].toCharArray();
    		char [] ArrayB = b[i].toCharArray();
    		
    		Arrays.sort(ArrayA);
    		Arrays.sort(ArrayB);
    		
    		if (Arrays.equals(ArrayA, ArrayB)) {
    			
    			retorno[(i-1)] = 0;
    			continue;
			}
    		
    		counter2 = 0;
    		boolean possui = false;
    		
    		
    		for (int j = 0; j < ArrayB.length; j++) {
    			possui = false;
    			counter2 = 0;
    			
    			for (int j2 = 0; j2 < ArrayA.length; j2++) {
    				System.out.println(ArrayB[j]);
					if (ArrayB[j] == ArrayA[j2]) {
						possui = true;
					}
				}
    			
    			if(!possui) {
    				counter2++;
    			}
    			
    			retorno[(i-1)] = counter;
    			
			}
    		
		}
    	
    	

    	return retorno;
    }
    

    

}
