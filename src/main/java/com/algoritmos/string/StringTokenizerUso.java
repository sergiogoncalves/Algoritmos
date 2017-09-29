package com.algoritmos.string;

//Tem basicamente a função do split, quebra a string em diferentes tokens e possui alguns métodos
// hasMoreTokens, nextToken, countTokens entre outros

import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;



public class StringTokenizerUso {
	
	private final static Logger LOGGER = Logger.getLogger(StringTokenizer.class.getName());

	public static void printTokens(String string) {

		StringTokenizer st = new StringTokenizer(string);
		
		while (st.hasMoreTokens()) { // Cada vez que faz um nextToken ele retira da fila e o countTokens não funciona corretamente

			LOGGER.log(Level.INFO, st.nextToken());

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

			LOGGER.log(Level.WARNING, st.nextToken());

		}
		
		LOGGER.log(Level.WARNING, "Testando o novo log");

		return ret; 
	}

}
