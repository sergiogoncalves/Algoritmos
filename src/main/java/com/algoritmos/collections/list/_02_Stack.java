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
 * 
Stack
You add elements to the top of the stack and remove elements from the top
Last in First out principle LIFO
Methods
push() - pushes an object on to top of the stack
peek() - returns the object at top of the stack but not remove
pop() - return the object of top and remove it

Stack<Integer> stack = new java.util.Stack<>()

 */
package com.algoritmos.collections.list;

import java.util.Stack;

public class _02_Stack {
	
	public static String usandoPop(Stack<String> stack) {

		return stack.pop();
		
	}

}
