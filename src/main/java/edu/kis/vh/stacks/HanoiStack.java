package edu.kis.vh.stacks;

/**
 * @author jankowskirobert
 *
 */
public class HanoiStack extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > peek()) {
			totalRejected++;
		} else {
			super.push(in);
		}
	}
}
