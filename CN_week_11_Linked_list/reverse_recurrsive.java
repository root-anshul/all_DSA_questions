package CN_week_11_Linked_list;

public class reverse_recurrsive {

	public static void main(String[] args) {
		Node_use obj = new Node_use();
		Node<Integer> head= obj.create();
		Node<Integer> nhead=reverse_recursive(head);
		obj.print(nhead);
		
	}
	public static Node<Integer> reverse_recursive(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> newHead= reverse_recursive(head.next);
		Node<Integer>front = head.next;
		front.next=head;
		head.next=null;
		return newHead;
		
	}
	
	public static Node<Integer> reverse(Node head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
		//System.out.println(head.data);
		return head;
		}
		Node<Integer> temp=head;
		Node<Integer> prev=null;
		
		while(temp!=null) {
			Node<Integer>front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		//front.next=prev;
		return prev;
		
	}

}
