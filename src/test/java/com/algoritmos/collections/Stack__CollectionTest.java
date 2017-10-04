package com.algoritmos.collections;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import com.algoritmos.collections.list._02_Stack;

public class Stack__CollectionTest {

	@Test
	public void testUsandoPopPositive() {

		Stack<String> stack = new Stack<String>();

		stack.push("Sérgio");
		stack.push("Corrêa");
		stack.push("Gonçalves");
		String expected = "Gonçalves";

		String actual = _02_Stack.usandoPop(stack);

		assertEquals(expected, actual);
	}

	@Test
	public void testUsandoPopNegative() {

		Stack<String> stack = new Stack<String>();

		stack.push("Sérgio");
		stack.push("Corrêa");
		stack.push("Gonçalves");

		String expected = "Gonçalves";

		String actual = _02_Stack.usandoPop(stack);

		assertEquals(expected, actual);

	}

}
