package linkedList;

public class Stackusinglinkedlist {
	
	private Node head;
	
	public Stackusinglinkedlist(){
		head = null;
	}
	
	public void push(int data){
		head = new Node(data,head);
	}
	
	public void pop(){
		Node current = head;
		current = current.next;
		head = current;
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
	
	class Node{
		private int data;
		private Node next;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		Stackusinglinkedlist stack = new Stackusinglinkedlist();
		stack.push(4);
		stack.push(6);
		stack.push(1);
		stack.push(0);
		System.out.println(stack.toString());
		stack.pop();
		stack.pop();
		System.out.println(stack.toString());
	}
}
