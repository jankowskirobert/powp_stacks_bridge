package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.HanoiStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStackFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStackFactory;

class StacksDemo {

	public static void main(String[] args) {

		DefaultStacksFactory factory = new DefaultStacksFactory();
		testStacks(factory);
		ListStackFactory listFactory = new ListStackFactory();
		testStacks(listFactory);
		ArrayStackFactory arrayFactory = new ArrayStackFactory();
		testStacks(arrayFactory);
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}

		java.util.Random random = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			stacks[3].push(random.nextInt(20));
		}

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiStack) stacks[3]).reportRejected());
	}

}
