package se.cs.a4;

public class SnocList {
	private char c;
	private SnocList l;
	
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
	public String toString() {
		String data = "";
		SnocList current = this;
		do {
			data += current.c + ",";
			current = current.l;
		} while (current != null);

		return data;
	}

	public static SnocList recursiveReverse(SnocList list) {
		if (list == null || list.l == null) {
			return list;
		}

		SnocList reversedObj = recursiveReverse(list.l);

		SnocList current = reversedObj;
		while (current.l != null) {
			current = current.l;
		}

		current.l = list;
		list.l = null;

		return reversedObj;
	}

	public static void main(String[] args) {
		SnocList list = null;
		for (int i = 0; i < 10; i++) {
			list = new SnocList('a', new SnocList('p', new SnocList('p', null)));
		}
		SnocList reverse = recursiveReverse(list);

		System.out.println(reverse);
	}

}
