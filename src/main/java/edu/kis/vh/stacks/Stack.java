package edu.kis.vh.stacks;

public class Stack {

    private final int stackSize = 12;
    private int[] items = new int[stackSize];
    private final int stackBegin = -1;
    public int total = -1;

    public void push(int value) {
        if (!isFull()) {
            items[++total] = value;
        }
    }

    public boolean isEmpty() {
        return total == stackBegin;
    }

    public boolean isFull() {
        return total == stackSize - 1;
    }

    public int top() {
        if (isEmpty()) {
            return stackBegin;
        }
        return items[total];
    }

    public int pop() {
        if (isEmpty()) {
            return stackBegin;
        }
        return items[total--];
    }

}
