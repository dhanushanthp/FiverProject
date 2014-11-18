package se.cs.a4;

public class SnocList implements MyStack {
	private char c;
	private SnocList l;

	private ListChar topOfStack;
	
	public SnocList() {
		topOfStack = null;
	}
	
	public SnocList(char c, SnocList l) {
		this.c = c;
		this.l = l;
	}

	SnocList(Character node) {
		this(node, null);
	}

	SnocList(Character node, SnocList nextNode) {
		this.c = node;
		this.l = nextNode;
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
		return String.valueOf(c);
	}

	public static void reverseList(SnocList list){
		System.out.println(list.l.l.l);
		if (list.l == null) {
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		SnocList list = null;
		for (int i = 0; i < 10; i++) {
		 list = 	new SnocList('a', new SnocList('b',new SnocList('c', null)));
		}
		reverseList(list);
	}

}
