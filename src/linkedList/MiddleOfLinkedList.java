package linkedList;

public class MiddleOfLinkedList {
	
	private Node head = null;

	class Node{
		
		int data;
		Node next;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	private void addFirst(int data) {
		head = new Node(data, head);
	}
	
	public String toString(){
		Node current = head;
		StringBuilder result = new StringBuilder();
		while(current!=null){
			result.append(current.data + " ");
			current = current.next;
			
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		MiddleOfLinkedList list = new MiddleOfLinkedList();
		list.addFirst(1);
		list.addFirst(9);
		list.addFirst(6);
		list.addFirst(11);
		list.addFirst(4);
		list.addFirst(8);
		System.out.println(list.getMiddleElement());
	}

	private int getMiddleElement() {
		Node current1 = head,current2 = head;
		while(current1!=null && current1.next!=null){
			current1 = current1.next.next;
			current2 = current2.next;
		}
		if(current1 == null)
			System.out.println("Even elements");
		else
			System.out.println("odd elements");
		return current2.data;
	}
}
