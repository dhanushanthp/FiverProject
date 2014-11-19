package se.cs.a4;

public class AListPQueue implements MyPriorityQueue {

	private AList head;

	public AList getHead() {
		return head;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public void insertItem(int p, char c) {

		AList prev = null;
		AList current = this.head;
		while (current != null && current.getPriority() >= p) {
			prev = current;
			current = current.getTl();
		}

		AList temp = new AList(c, p, null);
		if (prev == null) {
			temp.setTl(this.head);
			this.head = temp;
		} else {
			temp.setTl(current);
			prev.setTl(temp);
		}
	}

	@Override
	public void deleteItem() {
		this.head = this.head.getTl();
	}

	@Override
	public char next() throws EmptyContainerException {
		return head.getTl().getHd();
	}
}
