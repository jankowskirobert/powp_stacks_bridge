package edu.kis.vh.stacks;

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

	private final Stack stack = new Stack();

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
