package edu.kis.vh.stacks;

public interface IStack {
	public void push(int value);
	public boolean isEmpty();
	public boolean isFull();
	public int top();
	public int pop();
	public int getTotal();
}
