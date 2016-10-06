package linkedList;

public class InsertNodeSortedLinkedList {
	
	private Node head;
	
	class Node{
		private int data;
		private Node next;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	public void addFirst(int data){
		head = new Node(data,head);
	}
	
	public String toString(){
		Node current = head;
		String output= "";
		while(current != null){
			output += current.data + " ";
			current = current.next;
		}
		return output;
	}
	
	public void insert(int value){
		if(head == null)
			addFirst(value);
		Node current = head;
		Node newNode = null;
		while(current.next!=null && current.data < value){
			newNode = current;
			current = current.next;
		}
		Node temp = new Node(value,null);
		newNode.next = temp;
		temp.next = current;
		
	}
	
	public static void main(String[] args) {
		InsertNodeSortedLinkedList ill = new InsertNodeSortedLinkedList();
		ill.addFirst(5);
		ill.addFirst(4);
		ill.addFirst(2);
		ill.addFirst(1);
		System.out.println(ill.toString());
		ill.insert(3);
		System.out.println(ill.toString());
	}
}
