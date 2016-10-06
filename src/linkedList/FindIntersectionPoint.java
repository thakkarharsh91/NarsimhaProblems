package linkedList;

public class FindIntersectionPoint {
	
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
		FindIntersectionPoint list1 = new FindIntersectionPoint();
		list1.addFirst(1);
		list1.addFirst(9);
		list1.addFirst(6);
		
		FindIntersectionPoint list2 = new FindIntersectionPoint();
		list2.addFirst(1);
		list2.addFirst(9);
		list2.addFirst(6);
		list2.addFirst(16);
		list2.addFirst(20);

		System.out.println(getIntersection(list1,list2));
	}

	private static int getIntersection(FindIntersectionPoint list1, FindIntersectionPoint list2) {
		Node current1 = list1.head;
		Node current2 = list2.head;
		int len1=0,len2=0,diff=0;
		while(current1!= null){
			current1 =current1.next;
			len1++;
		}
		while(current2!= null){
			current2 =current2.next;
			len2++;
		}
		current1 = list1.head;
		current2 = list2.head;
		
		if(len1 > len2){
			diff = len1 - len2;
			int i = 0;
			while(i < diff){
				current1 = current1.next;
				i++;
			}
		}
		else{
			diff = len2 - len1;
			int i = 0;
			while(i < diff){
				current2 = current2.next;
				i++;
			}
		}
		
		while(current1!= null && current2!=null){
			if(current1.data == current2.data)
				return current1.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
}
