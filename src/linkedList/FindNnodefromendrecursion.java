package linkedList;

public class FindNnodefromendrecursion {

	public static Node head;
	public static int counter = 0;
	
	public FindNnodefromendrecursion(){
		head = null;
	}
	
	public void add(int data){
		head = new Node(data, head);
	}
	
	public String toString(){
		Node current = head;
		String output = "";
		while(current!=null){
			output += current.data + " ";
			current = current.next;
		}
		return output;
	}
	
	private static void findNodeFromEnd(Node head,int value) {
		if(head != null){
			findNodeFromEnd(head.next,value);
			counter++;
			if(counter == value){
				System.out.println(head.data);
			}
		}
	}
	
	class Node{
		Node next;
		int data;
		
		public Node(int data,Node next){
			this.data = data; 
			this.next = next;
		}
	} 
	
	public static void main(String[] args) {
		FindNnodefromendrecursion fnn = new FindNnodefromendrecursion();
		fnn.add(1);
		fnn.add(6);
		fnn.add(2);
		fnn.add(10);
		fnn.add(11);
		fnn.add(3);
		fnn.add(4);
		fnn.add(9);
		System.out.println(fnn.toString());
		findNodeFromEnd(head,5);
	}

}
