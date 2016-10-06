package linkedList;

public class MergeTwoSortedLinkedLists {

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
		MergeTwoSortedLinkedLists list1 = new MergeTwoSortedLinkedLists();
		list1.addFirst(2);
		list1.addFirst(1);

		MergeTwoSortedLinkedLists list2 = new MergeTwoSortedLinkedLists();
		list2.addFirst(5);
		list2.addFirst(4);

		MergeTwoSortedLinkedLists mergeList = new MergeTwoSortedLinkedLists();
		Node current = mergeList.merge(list1,list2);
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}

	}

	private Node merge(MergeTwoSortedLinkedLists list1, MergeTwoSortedLinkedLists list2) {

		Node head = new Node(0,null);
		Node p = head;
		Node l1 = list1.head;
		Node l2 = list2.head;
		while(l1!=null||l2!=null){
			if(l1!=null&&l2!=null){
				if(l1.data < l2.data){
					p.next = l1;
					l1=l1.next;
				}else{
					p.next=l2;
					l2=l2.next;
				}
				p = p.next;
			}else if(l1==null){
				p.next = l2;
				break;
			}else if(l2==null){
				p.next = l1;
				break;
			}
		}

		return head.next;
	}
}
