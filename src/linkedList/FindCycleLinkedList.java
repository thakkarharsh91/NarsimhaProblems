package linkedList;

public class FindCycleLinkedList {

	private Node tail;

	class Node{
		private int data;
		private Node next;

		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {

		FindCycleLinkedList fll = new FindCycleLinkedList();
		fll.addNode(1);
		fll.addNode(2);
		fll.addNode(8);
		fll.addNode(5);
		fll.addNode(4);
		fll.addNode(6);
		fll.toString();
		Node flag = fll.checkIfCycleExists();
		System.out.println(flag.data);
		System.out.println(fll.getCycleLength());
	}

	private Node checkIfCycleExists() {
		boolean loopExists = false;
		Node slow = tail;
		Node fast = tail;
		while(fast!= null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				loopExists = true;
				break;
			}

		}
		if(loopExists){
			slow = tail;
			while(slow!=fast){
				slow = slow.next;
				fast = fast.next;
			}
			return fast;
		}
		else
			return null;
	}

	private int getCycleLength() {
		boolean loopExists = false;
		Node slow = tail;
		Node fast = tail;
		while(fast!= null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				loopExists = true;
				break;
			}

		}
		int length = 0;
		if(loopExists){
			do{
				slow= slow.next;
				length++;
			}while(slow!=fast);
		}
		return length;

	}

	private void addNode(int data) {
		Node current = new Node(data,null);
		if(tail == null){
			tail = current;
			tail.next = tail;
		}
		else{
			current.next = tail.next;
			tail.next = current;
		}
		tail=tail.next;
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

}
