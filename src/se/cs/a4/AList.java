package se.cs.a4;

public class AList {
	private char hd;
	
	public char getHd() {
		return hd;
	}

	private int priority;

	public int getPriority() {
		return priority;
	}
	
	private AList tl;

	public AList getTl() {
		return tl;
	}

	public AList(final char a, final int b, final AList ll) {
		this.hd = a;
		this.priority = b;
		this.tl = ll;
	}
	
	@Override
	public String toString() {
		String data = "";
		AList current = this;
		do {
			data += "(" + current.hd + "/" +current.priority  + "), ";
			current = current.tl;
		} while (current != null);

		return data;
	}
	
	public static void main(String[] args) {
		AList list = new AList('1', 2, new AList('2', 3, new AList('3', 4, null)));
		System.out.println(list);
	}
}
