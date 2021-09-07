package listaSimplesmenteEncadeada;

import listaSimplesmenteEncadeada.EmptySLinkedList;

public class SLinkedList {
	protected Node head;
	protected Node tail;
	
	
	protected long size;
	
	public SLinkedList() {
		head = tail = null;
		size = 0;
	}

	public void addHead(String elem) {
		Node v = new Node(elem, null);
		v.setNext(head);
		head = v;
		size = size + 1;
		
	}
	
	public String toString() {
		String s;
		Node p = head;

		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1)
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}

	public void addTail(String elem) {
		Node v = new Node(elem,null);
		v.setNext(null);
		tail.setNext(v);
		tail = v;
		size = size + 1;
		
	}

	public void removeFirst() {
		if (head == null) {
			throw new EmptySLinkedList("Simply Linked List is empty.");
		}
		
		
	}


}
