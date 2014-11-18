package se.cs.a4;
public class ListChar implements MyStack {
	Character currentNode;
	ListChar nextNode;

	private ListChar topOfStack;

	public ListChar() {
		topOfStack = null;
	}

	ListChar(Character node) {
		this(node, null);
	}

	ListChar(Character node, ListChar nextNode) {
		this.currentNode = node;
		this.nextNode = nextNode;
	}

	@Override
	public char top() throws EmptyContainerException {
		if (isEmpty()) {
			throw new EmptyContainerException("No nodes found");
		} else {
			return topOfStack.currentNode;
		}
	}

	@Override
	public void pop() {
		topOfStack = topOfStack.nextNode;
	}

	@Override
	public void push(char c) {
		topOfStack = new ListChar(c, topOfStack);

	}

	@Override
	public boolean isEmpty() {
		return topOfStack == null;
	}
	
	@Override
	public String toString() {
		String data = "";
		ListChar current = this;
		do {
			data += current.currentNode + ",";
			current = current.nextNode;
		} while (current != null);

		return data;
	}

	public static void main(String[] args) throws EmptyContainerException {
		ListChar charList = new ListChar();

		for (int i = 0; i < 10; i++) {
			charList.push((char) ('0' + i));
		}

		while (!charList.isEmpty())
			charList.pop();
	}

}
