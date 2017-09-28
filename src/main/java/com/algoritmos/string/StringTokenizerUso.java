package com.algoritmos.string;

//Tem basicamente a função do split, quebra a string em diferentes tokens e possui alguns métodos
// hasMoreTokens, nextToken, countTokens entre outros

import java.util.StringTokenizer;

public class StringTokenizerUso {

	public static void printTokens(String string) {

		StringTokenizer st = new StringTokenizer(string);
		
		while (st.hasMoreTokens()) { // Cada vez que faz um nextToken ele retira da fila e o countTokens não funciona corretamente

			System.out.println(st.nextToken());

		}
	}

	public static int getQuantidadeTokens(String string) {

		StringTokenizer st = new StringTokenizer(string);

		return st.countTokens();
	}

	public static int getQuantidadeTokensComLimitador(String string, String limitador) {

		StringTokenizer st = new StringTokenizer(string, limitador);
		
		int ret = st.countTokens();

		while (st.hasMoreTokens()) {

			System.out.println(st.nextToken());

		}

		return ret; 
	}

}
