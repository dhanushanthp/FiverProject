package se.cs.a4;

public class SnocQueue implements MyQueue {
	private SnocList queue;

	@Override
	public char peek() throws EmptyContainerException {
		return queue.recursiveReverse(queue).c;
	}

	@Override
	public void dequeue() {
		queue = queue.l;
	}

	@Override
	public void enqueue(char c) {
		queue = new SnocList(c, queue);
		queue = queue.recursiveReverse(queue);
	}

	@Override
	public boolean isEmpty() {
		return queue == null;
	}

	public static void main(String[] args) throws EmptyContainerException {
		SnocQueue s = new SnocQueue();
		s.enqueue('a');
		s.enqueue('b');
		s.enqueue('c');
		s.enqueue('d');
		System.out.println(s.isEmpty());
		s.dequeue();
		s.dequeue();
		s.dequeue();
		s.dequeue();
		s.enqueue('s');
		s.enqueue('w');
		System.out.println(s.peek());
	}

}
