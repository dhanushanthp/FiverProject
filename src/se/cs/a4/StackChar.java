package se.cs.a4;
import java.util.ArrayList;

public class StackChar implements MyStack {
	private ArrayList<Character> a;

	public StackChar() {
		a = new ArrayList<Character>();
	}

	@Override
	public boolean isEmpty() {
		return a.isEmpty();
	}

	@Override
	public char top() throws EmptyContainerException {
		return (a.get(a.size() - 1));
	}

	@Override
	public void pop() {
		a.remove((a.size() - 1));
	}

	@Override
	public void push(char c) {
		a.add(c);
	}

	public static void main(String[] args) {
		StackChar sc = new StackChar();

		for (int i = 0; i < 10; i++) {
			sc.push('1');
		}

		for (int i = 0; i < 5; i++) {
			sc.pop();
		}

		System.out.println(sc.a.size());
	}
}