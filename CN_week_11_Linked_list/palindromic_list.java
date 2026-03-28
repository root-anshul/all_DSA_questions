package CN_week_11_Linked_list;

import java.util.Scanner;
import java.util.Stack;

public class palindromic_list {

public static void print(Node<Integer>head){
	
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
}

public static boolean palin(Node<Integer>head) {
	Stack<Integer> st=new Stack<>();
	Node<Integer>temp=head;
	while(temp!=null) {
		st.push(temp.data);
		System.out.println(temp.data);
		temp=temp.next;
	}
	

	temp=head;
	while(temp.next!=null) {
		if(temp.data!=st.peek()) {
			return false; 
		}else {
			temp=temp.next;
			st.pop();
		}
	}
	return true;
	
}


public static Node<Integer> create() {

	
	Node<Integer> head=null;
	Node<Integer> tail=null;
	Scanner in =new Scanner(System.in);
	int data=in.nextInt();
	
	while(data!=-1) {
		Node<Integer>newnode=new Node<>(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}else {
			tail.next=newnode;
			tail=tail.next;
			
		}
		data=in.nextInt();
	}
	return head;
}

public static Node<Integer> midpoint(Node<Integer>head){
	Node<Integer>slow=head;
	Node<Integer>fast=head;
	while(slow.next!=null && fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;
}
public static void palindrome(Node<Integer>head){

	
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
	Node<Integer>front=null;
	while(temp.next!=null) {
		front=temp.next;
		temp.next=prev;
		prev=temp;
		temp=front;
	}
	front.next=prev;
	return front;
	
}
public static void main(String arge[]) {
	Node<Integer>head=create();
	//print(head);
	boolean ans=palin(head);
	System.out.println(ans);
}
}
