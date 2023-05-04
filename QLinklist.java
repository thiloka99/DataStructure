class QLinkedlist{
	
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data  = data;
			this.next = null;
		}
		
	}
	Node front = null;
	Node rear = null;
	
	boolean isEmpty(){
		if(rear == null){
			return true;
		}
		else{
			return false;
		}
	}
	void enQueue(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			//System.out.println("Queue is empty for enQueue");
			front = rear = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
	}
	void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty for deQueue");
		}
		else{
			front = front.next;
		    if(front == null){
				rear = null;
			}
		}
	}
	void peek(){
		if(isEmpty()){
			System.out.println("Queue is empty for peek");
		}
		else{
			System.out.println("First Node ="+front.data);
		}
	}
	void print(){
		Node temp = front;
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			while(temp != null){
				System.out.print(temp.data+" ,");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		QLinkedlist QL = new QLinkedlist();
		QL.enQueue(10);
		QL.enQueue(4);
		QL.enQueue(300);
		QL.enQueue(550);
		QL.print();
		QL.peek();
		
		QL.deQueue();
		QL.deQueue();
		QL.print();
	}
}