package se.cs.a4;

public class SnocList {
	 char c;
	 SnocList l;
	
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

	public static void main(String[] args) {
		SnocList list = null;
		for (int i = 0; i < 10; i++) {
			list = new SnocList('a', new SnocList('p', new SnocList('p', null)));
		}
		SnocList reverse = list.recursiveReverse(list);

		System.out.println(reverse);
	}

}
