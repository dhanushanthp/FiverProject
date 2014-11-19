package se.cs.a4;

public class SnocList {
	private char c;
	private SnocList l;

	public char getC() {
		return c;
	}

	public SnocList getL() {
		return l;
	}

	public SnocList(char c, SnocList l) {
		this.c = c;
		this.l = l;
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

	public SnocList recursiveReverse(SnocList list) {
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
}
