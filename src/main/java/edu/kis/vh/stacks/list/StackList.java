package edu.kis.vh.stacks.list;

public class StackList {

    private Node last;
    private final int stackEmpty = -1;

    public void pushElement(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.previous = last;
            last = last.next;
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
        return last.value;
    }

    public int pop() {
        if (empty()) {
            return stackEmpty;
        }
        int ret = last.value;
        last = last.previous;
        return ret;
    }

}
