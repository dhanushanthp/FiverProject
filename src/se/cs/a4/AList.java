package se.cs.a4;

public class AList {
	private int hd;
	private int priority;
	private AList tl;

	public AList(final int a, final int b, final AList ll) {
		this.hd = a;
		this.priority = b;
		this.tl = ll;
	}
}
