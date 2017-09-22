package com.algoritmos.collections.diversos;

import java.util.*;


public class FindQtdeItensMenores {
	
    static int[] counts(int[] nums, int[] maxes) {

    	List<Integer> ret = new ArrayList<Integer>();
    	int counter = 0;
    	
    	for (Integer number : maxes) {
    		counter = 0;
    		
    		for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= number) {
					counter++;
				}
			}
    		ret.add(counter);
		}
    	
    	int[] ret2 = new int[ret.size()];
    	 
    	counter = 0;
    	for (int valor : ret) {
    		ret2[counter] = valor;
    		counter++;
		}
    	
    	
    	return ret2;
    }


}
