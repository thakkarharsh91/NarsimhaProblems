package linkedList;

public class FindNnodefromendtwopointers {

	public static Node head;
	
	public FindNnodefromendtwopointers(){
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
		Node pNthNode = null;
		Node current = head;
		for(int i =1;i<value;i++){
			if(current!=null)
				current = current.next;
		}
		while(current!=null){
			if(pNthNode == null)
				pNthNode = head;
			else
				pNthNode = pNthNode.next;
			current = current.next;
		}
		if(pNthNode!= null)
			return pNthNode.data;
		return 0;
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
		FindNnodefromendtwopointers fnn = new FindNnodefromendtwopointers();
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
