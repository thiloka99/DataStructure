class stack{
	class Node{
		String data;
		Node next;
		public Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	
	boolean isEmpty(){
		return (top==null);
	}
	void push(String data){
		Node newNode = new Node(data);
		if(isEmpty()){
			top = newNode;
		}
		else{
			newNode.next = top;
		    top = newNode;
		}
	}
	String pop(){
		
		if(isEmpty()){
			return null;
		}
		else{
			top = top.next;
			return top.data;
		}
	}
	String peek(){
		if(isEmpty()){
			return null;
		}
		else{
			return top.data;
		}
	}
	void print(){
		Node temp = top;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}  
		else{
			while(temp != null){
				System.out.print(temp.data+"  ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
class Main{
	public static void main(String []args){
		stack s2 = new stack();
		s2.push("C1");
		s2.push("H2");
		s2.push("A3");
		s2.print();
		System.out.println("peek is = "+s2.peek());
		s2.pop();
		s2.print();
	}
}