package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

/**
 * @author jankowskirobert
 *
 */
public class Stack {

	private IStack stack;

	public Stack() {
		this.stack = new StackList();
	}

	public Stack(IStack stack) {
		this.stack = stack;
	}
	
	public void push(int value) {
		stack.push(value);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public boolean isFull() {
		return stack.isFull();
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public int pop() {
		return stack.pop();
	}



}
