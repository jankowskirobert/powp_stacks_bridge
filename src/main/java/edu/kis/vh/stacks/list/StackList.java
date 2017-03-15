package edu.kis.vh.stacks.list;

public class StackList {

    private Node last;
    private final int stackEmpty = -1;

    public void pushElement(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrevious(last);
            last = last.getNext();
        }
    }

    public boolean empty() {
        return last == null;
    }

    public boolean full() {
        return false;
    }

    public int peek() {
        if (empty()) {
            return stackEmpty;
        }
        return last.getValue();
    }

    public int pop() {
        if (empty()) {
            return stackEmpty;
        }
        int ret = last.getValue();
        last = last.getPrevious();
        return ret;
    }
    
    class Node {

    	// utworzone zostalo pole klasy Node oraz przy wkladaniu elementu do list
    	// tworzona jest jej instancja jesli pole nie jest zainicjalizowane
    	// dostep do poprzedniego i nastepnego pola realizowany jest przez gettery
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
