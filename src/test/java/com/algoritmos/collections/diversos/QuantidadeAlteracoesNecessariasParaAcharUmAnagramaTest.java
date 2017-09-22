package com.algoritmos.collections.diversos;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuantidadeAlteracoesNecessariasParaAcharUmAnagramaTest {

	@Test
	public void test() {
		String[] array01 = {"10", 
				            "hhpddlnnsjfoyxpci", 
				            "xulkowreuowzxgnhmiqekxhz", 
				            "dnqaurlp", 
				            "aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqra",
		                    "lbafwuoawkxydlfcbjjtxpzpchzrvbtiev",
		                    "drngbjuuhmwqwxrinxccsqxkp",
		                    "ubu",
		                    "vxxzsqjqsnibgydzlyynqcrayvw",
		                    "xtnipeqhxvafqaggqoanvwk",
		                    "gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvz"};
		
		String[] array02 = {"10",
				"ioigvjqzfbpllssuj",
				"istdocbnyozmnqthhpievvlj",
				"lofnrtmh",
				"sqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb",
				"qbpedlqbktorypcjkzzkodrpvosqzxmpad",
				"wygwcdbtriwaesjsobrntzaqbe",
				"lzt",
				"jurfsqfrivayopgrxewwruvemzy",
				"mthtfirwhmjrbphlmeluvoa",
				"nspiwquxxsiwuldizqkkaawpyyisnftdzklwagv"};
 		
		
		
		QuantidadeAlteracoesNecessariasParaAcharUmAnagrama.getMinimumDifference(array01,array02);
		
		
		
		
		
	}

}
