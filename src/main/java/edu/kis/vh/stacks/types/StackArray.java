package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

/**
 * @author jankowskirobert
 *
 */
public class StackArray implements IStack {

	private final int stackSize = 12;
	private final int[] items = new int[stackSize];	
	private int total = -1;

	/**
	 * Wklada wartosc na stos
	 * 
	 * @param value
	 *            wartosc ktora ma byc wlozona na stos
	 */
	@Override
	public void push(int value) {
		if (!isFull()) {
			items[++total] = value;
		}
	}

	/**
	 * Czy stos jest pusty?
	 * 
	 * @return jesli stos jest pusty true; w przeciwnym razie false
	 */
	@Override
	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	/**
	 * Czy stos jest pelny?
	 * 
	 * @return jesli stos jest pelny true; w przeciwnym razie false
	 */
	@Override
	public boolean isFull() {
		return total == stackSize - 1;
	}

	/**
	 * Pobranie wartosci z samej gory stosu
	 * 
	 * @return
	 */
	@Override
	public int peek() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		return items[total];
	}

	/**
	 * Pobranie wartosci z samej gory stosu i usuniecie jej
	 * 
	 * @return
	 */
	@Override
	public int pop() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		return items[total--];
	}

}
