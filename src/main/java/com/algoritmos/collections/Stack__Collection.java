/*
 * Stack. 
 * This collection is implements LIFO: the last in is the first out. 
 * We push elements onto the top of a stack and then pop them for retrieval.
 * 
 * Push: We invoke push() on the stack. When we push "fly" to the stack, the "fly" is at the top of the stack.
 * 
 * Peek: This returns (but does not remove) the topmost element of the stack (in this case "butterfly").
 * 
 * Pop: We call pop() twice to remove the topmost element, and then the new topmost element. We display both results.
 * 
 * Add, loop. A Stack is based on the Vector type. We can invoke all the Vector's methods: here we call add() instead of push() to add elements.
 * 
 */
package com.algoritmos.collections;

import java.util.Stack;

public class Stack__Collection {
	
	public static String usandoPop(Stack<String> stack) {

		return stack.pop();
		
	}

}
