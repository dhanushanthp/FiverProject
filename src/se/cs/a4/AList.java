package se.cs.a4;

public class AList {
	private char hd;
	private int priority;
	private AList tl;
	
	public char getHd() {
		return hd;
	}

	public int getPriority() {
		return priority;
	}

	public AList getTl() {
		return tl;
	}

	public void setTl(AList tl) {
		this.tl = tl;
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
			data += "(" + current.hd + "/" + current.priority + "), ";
			current = current.tl;
		} while (current != null);

		return data;
	}
}
