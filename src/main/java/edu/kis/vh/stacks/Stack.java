package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author jankowskirobert
 *
 */
public class Stack implements StackDefault {

	private StackDefault stack;

	public Stack() {
		this.stack = new StackList();
	}

	public Stack(StackDefault stack) {
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
	public int top() {
		return stack.top();
	}
	@Override
	public int pop() {
		return stack.pop();
	}



}
