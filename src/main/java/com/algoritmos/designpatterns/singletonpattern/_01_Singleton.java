/*
 * A idéia do cerce da questão em se falando de Singleton, 
 * é de que tenhamos uma classe-objeto capaz de ser instanciada(criada em memória pronta para seu uso) 
 * uma ÚNICA VEZ e com visibilidade e acessibilidade global dessa instância em um determinado escopo de projeto.
 */
package com.algoritmos.designpatterns.singletonpattern;

public class _01_Singleton {
	
	private static final _01_Singleton INSTANCE = new _01_Singleton();
	private static final String TEST = "HELLO SINGLETON";
	
	private static String Singleton = "I can see outside";

	private _01_Singleton() { //Construtor privado
	}

	public static _01_Singleton getInstance() { // Method responsible by the control of a unique instance
		return INSTANCE;
	}
	
	public static void open() {
		System.out.println("Open window!");
	}
	
	public static void close() {
		System.out.println("Close window!");
	}


}
