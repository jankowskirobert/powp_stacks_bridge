package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.FifoStack;
import edu.kis.vh.stacks.HanoiStack;

/**
 * @author jankowskirobert
 *
 */
public interface IStacksFactory {

	/**
	 * @return standardowy stos
	 */
	public Stack getStandardStack();

	/**
	 * @return falszywy stos
	 */
	public Stack getFalseStack();

	/**
	 * @return stos typu first-in-first-out
	 */
	public FifoStack getFIFOStack();

	/**
	 * @return stos typu hanoi
	 */
	public HanoiStack getHanoiStack();

}
