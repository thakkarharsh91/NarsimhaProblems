package linkedList;

public class FindNnodefromendonepointer {

	public static Node head;
	
	public FindNnodefromendonepointer(){
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
	
	private static int findNodeFromEnd(int value) {
		Node current = head;
		int count = 0;
		while(current!=null){
			current = current.next;
			count++;
		}
		current  = head;
		for(int i =0;i<(count-value)-1;i++){
			current = current.next;
		}
		return current.data;
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
		FindNnodefromendonepointer fnn = new FindNnodefromendonepointer();
		fnn.add(1);
		fnn.add(6);
		fnn.add(2);
		fnn.add(10);
		fnn.add(11);
		fnn.add(3);
		fnn.add(4);
		fnn.add(9);
		System.out.println(fnn.toString());
		System.out.println(findNodeFromEnd(5));
	}

}
