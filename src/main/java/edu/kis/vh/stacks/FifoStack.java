package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.*;
/**
 * @author jankowskirobert
 *
 */
public class FifoStack extends Stack {

	public FifoStack() {
		super();
	}

	public FifoStack(IStack stack) {
		super(stack);
	}

	private final StackList stack = new StackList();

	@Override
	public int pop() {
		while (!isEmpty()) {
			stack.push(super.pop());
		}

		int ret = stack.pop();

		while (!stack.isEmpty()) {
			push(stack.pop());
		}

		return ret;
	}
}
