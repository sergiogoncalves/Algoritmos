package com.algoritmos.tryWithResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryWithResource {

	private final static Logger LOGGER = Logger.getLogger(TryWithResource.class.getName());
	
	public static void main(String[] args) {
		lerXml();
		lerXml();
	}

	public static String lerXml() {
		String nome = "C:\\Users\\005712431\\Desktop\\NewGtv.xml"; // ler.nextLine();
		StringBuilder arqXml = new StringBuilder();

		try(BufferedReader lerArq = new BufferedReader(new FileReader(new File(nome))); ) 
		{
			
			String linha;

			linha = "";

			while (linha != null) {

				linha = lerArq.readLine();

				if (linha != null) {
					arqXml.append(linha);
					
				} else {
					linha = null;
				}

			}
			LOGGER.log(Level.INFO, arqXml.toString());
			
		} catch (IOException e) {
			
			LOGGER.log(Level.SEVERE, e.getMessage());
			
		}
		return arqXml.toString();
	}

}
