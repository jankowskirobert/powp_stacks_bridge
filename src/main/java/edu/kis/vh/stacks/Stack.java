package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

/**
 * @author jankowskirobert
 *
 */
public class Stack implements IStack {

	private IStack stack;

	public Stack() {
		this.stack = new StackList();
	}

	public Stack(IStack stack) {
		this.stack = stack;
	}
	@Override
	public void push(int value) {
		stack.push(value);
	}
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	@Override
	public boolean isFull() {
		return stack.isFull();
	}
	@Override
	public int peek() {
		return stack.peek();
	}
	@Override
	public int pop() {
		return stack.pop();
	}



}
