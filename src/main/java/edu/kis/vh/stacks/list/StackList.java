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

}
