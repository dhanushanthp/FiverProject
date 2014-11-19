package se.cs.a4;
public class ListChar implements MyStack {
	private Character currentNode;
	private ListChar nextNode;

	private ListChar head;

	public ListChar() {
		head = null;
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
			return head.currentNode;
		}
	}

	@Override
	public void pop() {
		head = head.nextNode;
	}

	@Override
	public void push(char c) {
		head = new ListChar(c, head);

	}

	@Override
	public boolean isEmpty() {
		return head == null;
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
}
