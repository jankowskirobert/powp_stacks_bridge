package edu.kis.vh.stacks.list;

public class Node {

	// utworzone zostalo pole klasy Node oraz przy wkladaniu elementu do list
	// tworzona jest jej instancja jesli pole nie jest zainicjalizowane
	// dostep do poprzedniego i nastepnego pola realizowany jest przez gettery
	private int value;
	private Node previous;
	private Node next;

	public Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	Node getPrevious() {
		return previous;
	}

	void setPrevious(Node previous) {
		this.previous = previous;
	}

}
