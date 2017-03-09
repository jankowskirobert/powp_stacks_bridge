package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.FifoStack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.IStacksFactory;

public class DefaultStacksFactory implements IStacksFactory {

    @Override
    public Stack getStandardStack() {
        return new Stack();
    }

    @Override
    public Stack getFalseStack() {
        return new Stack();
    }

    @Override
    public FifoStack getFIFOStack() {
        return new FifoStack();
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi();
    }

}
