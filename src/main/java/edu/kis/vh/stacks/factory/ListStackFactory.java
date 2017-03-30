package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.FifoStack;
import edu.kis.vh.stacks.HanoiStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class ListStackFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackArray());
	}

	@Override
	public FifoStack getFIFOStack() {
		return new FifoStack(new StackList());
	}

	@Override
	public HanoiStack getHanoiStack() {
		return new HanoiStack(new StackList());
	}

}
