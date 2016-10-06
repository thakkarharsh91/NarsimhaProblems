package linkedList;

public class ReverseLinkedList {
	
	private Node head = null;

	class Node{
		
		int data;
		Node next;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
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
		ReverseLinkedList list = new ReverseLinkedList();
		list.addFirst(1);
		list.addFirst(9);
		list.addFirst(6);
		System.out.println(list.toString());
		System.out.println(list.reverseList().toString());
		System.out.println(list.reverseRecursive().data);
		
	}

	private Node reverseRecursive() {
		if(head!=null)
			head = recursive(null,head);
		return head;
	}

	private Node recursive(Node prev, Node current) {
		Node next =current.next;
		current.next = prev;
		if(next == null)
			return current;
		else
			return recursive(current, next);
	}

	private ReverseLinkedList reverseList() {
		ReverseLinkedList reverseList = new ReverseLinkedList();
		Node current = head;
		while(current!=null){
			reverseList.addFirst(current.data);
			current = current.next;
		}
		return reverseList;
	}

	private void addFirst(int data) {
		head = new Node(data, head);
	}
}
