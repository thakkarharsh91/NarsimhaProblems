package linkedList;

public class OperationsSingleLinkedList {
	
	private Node head;
	private int size;

	public OperationsSingleLinkedList(){
		head = null;
	}
	
	private boolean checkIfCycleExists() {
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				return true;
			}

		}
		return false;
	}

	public void addFirst(int data){
		head = new Node(data, head);
		size++;
	}

	public void addLast(int data){
		if(head == null)
			addFirst(data);
		else{
			Node temp = head;
			while(temp.next!=null) temp = temp.next;
			temp.next = new Node(data, null);
			size++;
		}
	}
	
	public void removeFirst(){
		head = head.next;
	}
	
	public void removeLast(){
		Node current = head;
		while(current.next.next!=null){
			current = current.next;
		}
		current.next =null;
	}
	
	public int getFirst(){
		return head.data;
	}
	
	public int getLast(){
		Node current = head;
		while(current.next!=null) current = current.next;
		return current.data;
	}
	
	public int get(int pos){
		Node current = head;
		for(int i = 0; i< pos; i++) current = current.next;
		return current.data;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public boolean contains(int data){
		Node current = head;
		boolean flag = false;
		while(current.next!=null){
			if(current.data == data){
				flag = true;
				break;
			}
			current = current.next;
			flag = false;
		}
		return flag;
	}
	
	public void addAfter(int data,int item){
		Node current = head;
		while(current.next!=null && !(current.data==item)) current = current.next;
		current.next = new Node(data, current.next);
	}
	
	public void addBefore(int data,int item){
		if(head == null) return;
		if(head.data == item) addFirst(data);
		Node prev = null;
		Node curr = head;
		while(curr!=null && !(curr.data == item)){
			prev = curr;
			curr = curr.next;
		}
		if(curr!=null)
			prev.next = new Node(data, prev.next);
	}
	
	public void add(int data, int position){
		Node current = head;
		for(int i=0;i<position;i++){
			current = current.next;
		}
		current.next = new Node(data,current.next);
	}
	
	public void remove(int position){
		Node current = head;
		for(int i=1;i<position;i++){
			current = current.next;
		}
		current.next = current.next.next;
	}
	
	public void removeItem(int data){
		Node current = head;
		Node previous = null;
		while(current.next!=null && !(current.data == data)){
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
	}
	
	public int getPosition(int data){
		Node current = head;
		int counter = 0;
		while(current.next!=null){
			if(current.data == data){
				return counter;
			}
			counter++;
			current = current.next;
		}
		return Integer.MIN_VALUE;
	}
	
	public OperationsSingleLinkedList reverseList(){
		OperationsSingleLinkedList reverseList = new OperationsSingleLinkedList();
		Node current = head;
		while(current!=null){
			reverseList.addFirst(current.data);
			current = current.next;
		}
		return reverseList;
	}
	
	public int getSize(){
		return size;
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
		
		OperationsSingleLinkedList soll = new OperationsSingleLinkedList();
		soll.addFirst(1);
		soll.addFirst(2);
		soll.addFirst(4);
		soll.addFirst(3);
		//System.out.println(soll.toString());
		soll.addLast(9);
		soll.addLast(7);
		//System.out.println(soll.toString());
		soll.removeFirst();
		//System.out.println(soll.toString());
		soll.removeLast();
		//System.out.println(soll.toString());
		//System.out.println(soll.getFirst());
		//System.out.println(soll.getLast());
		//System.out.println(soll.get(2));
		//System.out.println(soll.isEmpty());
		//System.out.println(soll.toString());
		//System.out.println(soll.contains(11));
		//soll.addAfter(15, 1);
		//System.out.println(soll.toString());
		//soll.addBefore(12, 1);
		//System.out.println(soll.toString());
		//soll.add(3,2);
		//System.out.println(soll.toString());
		//soll.remove(2);
		//System.out.println(soll.toString());
		//soll.removeItem(1);
		//System.out.println(soll.toString());
		//System.out.println(soll.getPosition(2));
		System.out.println(soll.toString());
		System.out.println(soll.reverseList());
		System.out.println(soll.getSize());
		boolean flag = soll.checkIfCycleExists();
		if(flag== true)
			System.out.println("exist");
		else
			System.out.println("does not exist");
	}
}