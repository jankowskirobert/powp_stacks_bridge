package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author jankowskirobert
 *
 */
public class Stack implements IStack {

	private StackList stack;

	public Stack() {
		this.stack = new StackList();
	}

	public Stack(StackList stackArray) {
		this.stack = stackArray;
	}

	public void push(int value) {
		stack.pushElement(value);
	}

	public boolean isEmpty() {
		return stack.empty();
	}

	public boolean isFull() {
		return stack.full();
	}

	public int top() {
		return stack.peek();
	}

	public int pop() {
		return stack.pop();
	}



}
