public class LinkedList{
	Node head;
	Node tail;
	int size;
	// creating head, tail and size
	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	// To know the number of element in linklist
	public int size(){
		return size;
	}
	// to know size given in the statement in true of false
	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
	// getting of element in first node
	public int first(){
		return head.getElement();
	}
	// getting of element in last node
	public int last(){
		return tail.getElement();
	}

	// adding of element in fist node
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if (size == 0) {
			 head = newest;
			 tail = newest;
		}

		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;
	}

	// adding of element in last node
	public void addLast(int n){
		Node newest = new Node(n, null);
		if (size == 0) {
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail =newest;
		}
		size += 1;
	}

	// removing of element in fist node
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0;
		}
		else{
			head = head.getNext();
			size = size -1;
		}
		return deletedElement;
	}



}

class Node{
	private int element;
	private Node next;
	// constructor
	public Node(int element, Node next ){
	    this.element = element;
		this.next = next;
	}

	// getElement
	public int getElement(){
		return element;
	}

	// getNext()
	public Node getNext(){
		return next;
	}

	// setElement
	public void setElement(int n){
		element = n;
	}

	// setNext()
	public void setNext(Node n){
		next = n;
	}
}