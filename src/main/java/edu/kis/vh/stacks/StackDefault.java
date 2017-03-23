package edu.kis.vh.stacks;

public interface StackDefault {
	final int STACK_EMPTY = -1;
	public void push(int value);
	public boolean isEmpty();
	public boolean isFull();
	public int top();
	public int pop();
}
