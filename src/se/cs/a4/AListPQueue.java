package se.cs.a4;

public class AListPQueue implements MyPriorityQueue {
	private AList pQueue;

	@Override
	public char next() throws EmptyContainerException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertItem(int p, char c) {
		if (pQueue == null) {
			pQueue = new AList(c, p, null);
		}else if(pQueue.getPriority() >= p){
			pQueue = new AList(c, p, pQueue);
		} else if (pQueue.getPriority() > pQueue.getTl().getPriority()) {
			pQueue = new AList(c,p, pQueue);
		} else {
			
		}
	}

	@Override
	public boolean isEmpty() {
		return pQueue == null;
	}
	
	public AList getPriQue(AList list){
		if(list == null){
			return list;
		}
		
		if(list.getPriority() > pQueue.getPriority()){
			
		}else{
			
		}
		return pQueue;
	}
	
	public static void main(String[] args) {
//		AList list = new AList('1', 2, new AList('2', 3, new AList('3', 4, null)));
		AListPQueue alp = new AListPQueue();
		alp.insertItem(2, 'a');
		alp.insertItem(1, 'b');
		System.out.println(alp.pQueue);
	}

}
