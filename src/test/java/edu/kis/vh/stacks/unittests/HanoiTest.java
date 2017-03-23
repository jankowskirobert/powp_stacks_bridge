package edu.kis.vh.stacks.unittests;

import org.junit.Test;

import edu.kis.vh.stacks.HanoiStack;
import junit.framework.Assert;

public class HanoiTest {

	@Test
	public void testRejectDefault() {
		HanoiStack stack = new HanoiStack();
		final int REJECTED = 0;
		Assert.assertEquals(REJECTED, stack.reportRejected());
	}
	@Test
	public void testPushRejected() {
		HanoiStack stack = new HanoiStack();
		final int REJECTED = 1;
		final int STACK_BEGIN = -1;
		stack.push(STACK_BEGIN+1);
		stack.push(Integer.MAX_VALUE);
		Assert.assertEquals(REJECTED, stack.reportRejected());
	}
	@Test
	public void testPush() {
		HanoiStack stack = new HanoiStack();
		final int REJECTED = 0;
		stack.push(Integer.MAX_VALUE);
		Assert.assertEquals(REJECTED, stack.reportRejected());
		Assert.assertEquals(Integer.MAX_VALUE, stack.peek());
		Assert.assertEquals(Integer.MAX_VALUE, stack.pop());
	}
	
}
