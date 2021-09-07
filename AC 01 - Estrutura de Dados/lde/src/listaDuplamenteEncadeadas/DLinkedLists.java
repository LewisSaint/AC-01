package listaDuplamenteEncadeadas;



public class DLinkedLists{
	
	protected DNode head;
	protected DNode tail;
	protected DNode trailer;
	
	
	protected long size;
	
	
	
	
	
	public void Dlist() {
		
		String string = "[]";
		
	}
	
	public void addLast(String elemento) {
		DNode v = new DNode(elemento, null, null);
		
		v.setNext(null);
		tail.setNext(v);
		tail = v;
		size = size + 1;
		
		
	}
	
	public void addFirst(String elemento) {
		
		DNode v = new DNode(elemento, null, null);
		v.setNext(head);
		head = v;
		size = size + 1;

	}
	
	public DNode getLast() {
		
		return trailer;
	}
	
	
		
}
	
	
	
	
