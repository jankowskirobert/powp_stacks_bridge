package edu.kis.vh.stacks;

/**
 * @author jankowskirobert
 *
 */
public class Stack {

	private final int stackSize = 12;
	private final int[] items = new int[stackSize];
	private final int stackBegin = -1;
	private int total = -1;

	/**
	 * Wklada wartosc na stos
	 * 
	 * @param value
	 *            wartosc ktora ma byc wlozona na stos
	 */
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
	public boolean isEmpty() {
		return total == stackBegin;
	}

	/**
	 * Czy stos jest pelny?
	 * 
	 * @return jesli stos jest pelny true; w przeciwnym razie false
	 */
	public boolean isFull() {
		return total == stackSize - 1;
	}

	/**
	 * Pobranie wartosci z samej gory stosu
	 * 
	 * @return
	 */
	public int top() {
		if (isEmpty()) {
			return stackBegin;
		}
		return items[total];
	}

	/**
	 * Pobranie wartosci z samej gory stosu i usuniecie jej
	 * 
	 * @return
	 */
	public int pop() {
		if (isEmpty()) {
			return stackBegin;
		}
		return items[total--];
	}

	/**
	 * Pobranie rozmiaru stosu
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

}
