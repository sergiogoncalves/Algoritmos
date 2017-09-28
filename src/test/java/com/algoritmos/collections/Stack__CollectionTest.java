package com.algoritmos.collections;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class Stack__CollectionTest {

	@Test
	public void testUsandoPopPositive() {

		Stack<String> stack = new Stack<String>();

		stack.push("Sérgio");
		stack.push("Corrêa");
		stack.push("Gonçalves");
		String expected = "Gonçalves";

		String actual = Stack__Collection.usandoPop(stack);

		assertEquals(expected, actual);
	}

	@Test
	public void testUsandoPopNegative() {

		Stack<String> stack = new Stack<String>();

		stack.push("Sérgio");
		stack.push("Corrêa");
		stack.push("Gonçalves");

		String expected = "Gonçalves";

		String actual = Stack__Collection.usandoPop(stack);

		assertEquals(expected, actual);

	}

}
