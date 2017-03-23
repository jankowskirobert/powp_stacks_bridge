package edu.kis.vh.stacks;

/**
 * @author jankowskirobert
 *
 */
public class Stack implements IStack {

	private StackArray stackArray;

	public Stack() {
		this.stackArray = new StackArray();
	}

	public Stack(StackArray stackArray) {
		this.stackArray = stackArray;
	}

	public void push(int value) {
		stackArray.push(value);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}


}
