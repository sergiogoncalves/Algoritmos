/*

Essa classe é a implementação da interface Map mais trabalhada no campo de desenvolvimento. 
O exemplo dessa classe está apresentado no exemplo da Listagem 2.

Características

Os elementos não são ordenados;
É rápida na busca/inserção de dados;
Permite inserir valore e chaves nulas;
HashMap mapa = new Type();


Métodos úteis
Esses métodos oferece bastante ajuda quando é trabalhado com a interface Map.

	values() - É uma Collection com todos os valores que foram associados a alguma das chaves.
	keySet() - Retorna um Set com as chaves do mapa especificado.
	entrySet() - Retorna um conjunto de Maps contido no mapa configurado, podendo ser possível acessar suas chaves e valores.
	put (Key key, Value value) - Associa um valor a uma chave específica.

Para interagir sobre um mapa é preciso trabalhar com a interface Collection ou métodos set() para converter esse mapa em um conjunto de dados.

*/
package com.algoritmos.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _01_HashMap {

	public static void main(String[] args) {
		   
		    Map<Integer, String> mapaNomes = new HashMap<Integer, String>(); 
		    
		    mapaNomes.put(1, "João Delfino");
		    mapaNomes.put(2, "Maria do Carmo");
		    mapaNomes.put(3, "Claudinei Silva");
		     
		    //Collection<integer> conjNomes = mapaNomes.keySet();
		     
		    Set<Entry<Integer, String>> set = mapaNomes.entrySet();
		    
		    Iterator it = set.iterator();
		     
		    System.out.println("Código\t\tValor");
		     
		    //getKey() - recupera a chave do mapa 
		    //getValue() - recupera o valor do mapa
		 
		    while(it.hasNext()){
		    	
		      Entry<Integer, String> entry = (Entry)it.next();
		      
		      System.out.println(entry.getKey() + "\t\t"+entry.getValue());
		    }
		  }

}
