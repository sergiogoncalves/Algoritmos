
/*
 Classe HashTable
	Essa classe trabalha com algoritmo hash para conversão das chaves e 
	um mecanismo de pesquisa de valores, sendo que tem seus métodos sincronizados (thread-safe) que permitem checar acessos concorrentes e armazenagem. 
	Também possui uma eficiente pesquisa de elementos baseados em chave-valor, mas não aceita valores nulos.

	HashTable<E> mapa = new Type<E>();
	Sintaxe
	
	E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
	Type - é o tipo de objeto da coleção a ser usado.
 
 */
package com.algoritmos.collections.map;

import java.util.Hashtable;

public class _02_HashTable {

	public static void main(String[] args) {

		Client c1 = new Client("754.856.869-88", "Valdinei Santos");
		Client c2 = new Client("828.929.222.12", "Claire Moura");
		Client c3 = new Client("156.565.556-88", "Vagner Seller");

		Hashtable<Integer, Client> ht = new Hashtable<Integer, Client>();

		ht.put(1, c1);
		ht.put(2, c2);
		ht.put(3, c3);

		System.out.println("CPF \t\t Cliente");

		for (int i = 1; i <= ht.size(); i++) {
			System.out.println(ht.get(i));
		}
	}
}

class Client {

	public String cpf;
	public String nome;

	public Client(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return cpf + " | " + nome;
	}
}
