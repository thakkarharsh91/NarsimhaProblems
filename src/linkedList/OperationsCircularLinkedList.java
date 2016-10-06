package linkedList;

public class OperationsCircularLinkedList {

	private Node tail;
	private int size;

	public OperationsCircularLinkedList(){
		tail = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}

	public int length(Node tail){
		Node current = tail.next;
		int length = 0;
		while(current!=tail){
			current = current.next;
			length++;
		}
		return length;
	}
	
	public int headPeek(){
		return tail.next.data;
	}

	public int tailPeek(){
		return tail.data;
	}
	
	public boolean contains(int data){
		Node current = tail.next;
		while(current!=tail && !(current.data==data)){
			current = current.next;
		}
		return current.data == data;
	}
	
	public void remove(int data){
		Node current = tail.next;
		Node previous = tail;
		while(current!=tail && !(current.data == data)){
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
	}
	
	public String toString(){
		Node current = tail.next;
		while(current!=tail){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(current.data + " ");
		return "";
	}

	public void addFirst(int data){
		Node current = new Node(data, null);
		if(tail == null){
			tail = current;
			tail.next = tail;
		}
		else{
			current.next = tail.next;
			tail.next = current;
		}
		size++;
	}
	
	public void addLast(int data){
		Node current = new Node(data, null);
		if(tail == null){
			tail = current;
			tail.next = tail;
		}
		else{
			current.next = tail.next;
			tail.next = current;
		}
		tail = tail.next;
		size++;
	}
	
	public void deleteFirst(){
		tail.next = tail.next.next;
		size--;
	}
	
	public void deleteLast(){
		Node current = tail;
		while(current.next!=tail){
			current = current.next;
		}
		current.next = tail.next;
		tail = current;
		size--;
	}
	
	class Node{
		private int data;
		private Node next;

		public Node(int data, Node next){
			this.data = data;
			this.next = next;		
		}
	}

	public static void main(String[] args) {

		OperationsCircularLinkedList soll = new OperationsCircularLinkedList();
		soll.addFirst(1);
		soll.addFirst(5);
		soll.addFirst(2);
		soll.addFirst(6);
		soll.toString();
		soll.addLast(11);
		soll.addLast(22);
		soll.toString();
		soll.deleteLast();
		soll.toString();
		soll.deleteFirst();
		soll.toString();
		System.out.println(soll.contains(5));
		soll.remove(1);
		soll.toString();
	}
}