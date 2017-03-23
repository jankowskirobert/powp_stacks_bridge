package edu.kis.vh.stacks.unittests;

import org.junit.Test;

import edu.kis.vh.stacks.FifoStack;
import junit.framework.Assert;

public class FifoTest {

	@Test
	public void testPop() {
		FifoStack stack = new FifoStack();
		Assert.assertEquals(0, stack.pop());
	}
	@Test
	public void testPushAndPop() {
		FifoStack stack = new FifoStack();
		stack.push(5);
		Assert.assertEquals(5, stack.pop());
		stack.push(5);
		stack.push(10);
		stack.push(15);
		Assert.assertEquals(5, stack.pop());
		Assert.assertEquals(15, stack.peek());
	}
}
