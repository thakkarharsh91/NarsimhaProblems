package linkedList;

public class OperationsDoubleLinkedList {
	
	private Node first;
	private Node last;
	private int size;

	public OperationsDoubleLinkedList(){
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void addFirst(int data){
		Node current = new Node(data);
		if(isEmpty())
			last = current;
		else
			first.previous = current;
		current.next = first;
		first = current;
	}
	
	public void addLast(int data){
		Node current = new Node(data);
		if(isEmpty())
			first = current;
		else{
			last.next = current;
			current.previous = last;
		}
		last = current;
	}
	
	public void deleteFirst(){
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
	}
	
	public void deleteLast(){
		if(first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
	}
	
	public void insertAfter(int key, int data){
		Node current = first;
		while(current.data != key){
			current = current.next;
		}
		Node newNode = new Node(data);
		if(current == last){
			newNode.next = null;
			newNode.previous = last;
			last = newNode;
		}
		else{
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
	}
	
	public void deleteKey(int key){
		Node current = first;
		while(current.data!=key)
			current = current.next;
		if(current == last){
			current.previous.next = null;
			last = current.previous;
		}
		else if(current == first) {
			current.next.previous = null;
			first = current.next;
		}
		else{
			current.next.previous =current.previous;
			current.previous.next =current.next;
		}
	}
	
	public String toString(){
		System.out.println("First --- Last");
		Node current = first;
		String output = "";
		while(current!=null){
			output += current.data + " ";
			current = current.next;
		}
		System.out.println(output);
		/*System.out.println("Last --- First");
		current = last;
		output = "";
		while(current!= null){
			output += current.data + " ";
			current = current.previous;
		}
		System.out.println(output);*/
		return "";
	}
	
	class Node{
		private int data;
		private Node next;
		private Node previous;

		public Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		
		OperationsDoubleLinkedList odll = new OperationsDoubleLinkedList();
		odll.addFirst(1);
		odll.addFirst(9);
		odll.addFirst(3);
		odll.addFirst(6);
		odll.addLast(10);
		odll.addLast(20);
		odll.toString();
		odll.deleteFirst();
		odll.toString();
		odll.deleteLast();
		odll.toString();
		odll.insertAfter(9, 5);
		odll.toString();
		odll.deleteKey(5);
		odll.toString();
		
	}
}