package edu.kis.vh.stacks.types;


import edu.kis.vh.stacks.IStack;

/**
 * Klasa pozwalajaca zaimplementowac liste ktora wraz z dodawaniem kolejnych
 * wartosci rosnie dynamicznie.
 * 
 * @author jankowskirobert
 *
 */
public class StackList implements IStack{

	private Node last;
	

	/**
	 * Dodaje wartosc <em>i</em> do listy i tworzy nowe dowiazanie
	 * 
	 * @param i
	 *            - wartosc dowiazania
	 */
	@Override
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.next.previous = last;
			last = last.next;
			last = last.getNext();
		}
	}

	/**
	 * Czy lista jest pusta?
	 * 
	 * @return true - jezeli ostatni element jest <em>null</em>; w innym
	 *         przypadku false
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Czy lista jest pelna?
	 * 
	 * @return true bo lista rosnie dynamicznie TODO: jesli nigdy nie jest pelny
	 *         to metoda jest nie potrzebna i mozna ja usunac
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/**
	 * Pobierz element ale nie usuwaj dowiazania
	 * 
	 * @return wartosc ostatniego elementu; jesli lista jest pusta to zwraca -1
	 * 
	 */
	@Override
	public int peek() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		return last.getValue();
	}

	/**
	 * Pobierz element i usun dowiazanie
	 * 
	 * @return wartosc ostatniego elementu; jesli lista jest pusta to zwraca -1
	 */
	@Override
	public int pop() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		int ret = last.getValue();
		last = last.getPrevious();
		return ret;
	}

	/**
	 * Element roboczy list, reprezentujacy wezel
	 * 
	 * @author jankowskirobert
	 *
	 */
	class Node {

		// utworzone zostalo pole klasy Node oraz przy wkladaniu elementu do
		// list
		// tworzona jest jej instancja jesli pole nie jest zainicjalizowane
		// dostep do poprzedniego i nastepnego pola realizowany jest przez
		// gettery
		private final int value;
		private Node previous;
		private Node next;

		public Node(int i) {
			value = i;
		}

		int getValue() {
			return value;
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
}
