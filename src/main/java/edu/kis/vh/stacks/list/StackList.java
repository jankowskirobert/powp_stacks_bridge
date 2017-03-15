package edu.kis.vh.stacks.list;

/**
 * Klasa pozwalajaca zaimplementowac liste ktora wraz z dodawaniem kolejnych
 * wartosci rosnie dynamicznie.
 * 
 * @author jankowskirobert
 *
 */
public class StackList {

	private Node last;
	private final int stackEmpty = -1;

	/**
	 * Dodaje wartosc <em>i</em> do listy i tworzy nowe dowiazanie
	 * 
	 * @param i
	 *            - wartosc dowiazania
	 */
	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrevious(last);
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
	public boolean empty() {
		return last == null;
	}

	/**
	 * Czy lista jest pelna?
	 * 
	 * @return true bo lista rosnie dynamicznie TODO: jesli nigdy nie jest pelny
	 *         to metoda jest nie potrzebna i mozna ja usunac
	 */
	public boolean full() {
		return false;
	}

	/**
	 * Pobierz element ale nie usuwaj dowiazania
	 * 
	 * @return wartosc ostatniego elementu; jesli lista jest pusta to zwraca -1
	 * 
	 */
	public int peek() {
		if (empty()) {
			return stackEmpty;
		}
		return last.getValue();
	}

	/**
	 * Pobierz element i usun dowiazanie
	 * 
	 * @return wartosc ostatniego elementu; jesli lista jest pusta to zwraca -1
	 */
	public int pop() {
		if (empty()) {
			return stackEmpty;
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
