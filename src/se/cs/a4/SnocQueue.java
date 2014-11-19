package se.cs.a4;

public class SnocQueue implements MyQueue {
	private SnocList queue;

	public SnocList getQueue() {
		return queue;
	}

	@Override
	public char peek() throws EmptyContainerException {
		return queue.getC();
	}

	@Override
	public void dequeue() {
		queue = queue.getL();
	}

	@Override
	public void enqueue(char c) {
		queue = new SnocList(c, queue);
	}

	@Override
	public boolean isEmpty() {
		return queue == null;
	}
}
