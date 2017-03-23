package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        int testValue = 4;
        stack.push(testValue);

        int result = stack.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        boolean result = stack.isEmpty();
        Assert.assertEquals(true, result);

        stack.push(888);

        result = stack.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        Stack stack = new Stack();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = stack.isFull();
            Assert.assertEquals(false, result);
            stack.push(888);
        }

        boolean result = stack.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testTop() {
        Stack stack = new Stack();
        final int EMPTY_STACK_VALUE = -1;

        int result = stack.peek();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stack.push(testValue);

        result = stack.peek();
        Assert.assertEquals(testValue, result);
        result = stack.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        final int EMPTY_STACK_VALUE = -1;

        int result = stack.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stack.push(testValue);

        result = stack.pop();
        Assert.assertEquals(testValue, result);
        result = stack.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
