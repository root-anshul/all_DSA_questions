package CN_week_11_Linked_list;

public class insert_recurrsive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_use obj =new Node_use();
		Node<Integer> head=obj.create();
		insert(head,10,2);
		obj.print(head);
	}
	public static Node<Integer> insert(Node<Integer> head,
			int ele,int pos){
		if(pos==0) {
			Node<Integer> newNode=new Node<Integer>(ele);
			newNode.next=head;
			return newNode;
			
		}
		if(head==null) {
			return head;
		}
		Node<Integer>temp=insert(head.next,ele,pos-1);
		head.next=temp;
		return head;
		
		
	}

}
