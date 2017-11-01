package com.algoritmos.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_OrderedHashMap {
	
	public static void main(String[] args) {
		
	    HashMap<Integer, String> mapaNomes = new HashMap<Integer, String>(); 
	    
	    mapaNomes.put(1, "João Delfino");
	    mapaNomes.put(2, "Maria do Carmo");
	    mapaNomes.put(3, "Claudinei Silva");
	    mapaNomes.put(4, "Amélia Mourão");
	     
	    ComparatorInts compInt = new ComparatorInts(mapaNomes);
	     
	    Map<Integer, String> mapaOrdenado = new TreeMap<Integer, String>(compInt);
	    
	    mapaOrdenado.putAll(mapaNomes);
	     
	    for(Integer valor : mapaOrdenado.keySet()){
	    	
	      System.out.println(valor + " " + mapaNomes.get(valor));
	      
	    }
	     
	  }

}
