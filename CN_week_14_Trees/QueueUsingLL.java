package CN_week_14_Trees;

public class QueueUsingLL<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		size=0;
	}
	
	int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public T front() {
		if(size==0) {
			System.out.println("Queue is Empty");
		return null;
		}else {
			return front.data;
		}
	}
	
	public void enqueue(T ele) {
		Node<T>nn=new Node<>(ele);
	
		
		if(size==0) {
			front=nn;
			rear=nn;
		}else {
			rear.next=nn;
			rear=nn;
		}
		size++;
		
	}
	
	public T dequeue() {
		if(size==0) {
			System.out.println("Queue is Empty");
		return null;
		}
		
		T temp =front.data;
		front=front.next;
		
		if(size==1) {
			rear=null;
		}
		
		size--;
		return temp;
		
		
	}
}
	
	
	
	
	
	
	
