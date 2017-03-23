package edu.kis.vh.stacks;

public interface IStack {
	final int STACK_EMPTY = 0;
	public void push(int value);
	public boolean isEmpty();
	public boolean isFull();
	public int peek();
	public int pop();
}
