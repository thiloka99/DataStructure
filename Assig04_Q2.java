class stack{
	class Node{
		String data;
		Node next;
		public Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	
	boolean isEmpty(){
		return top == null;
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
			System.out.println("stack is Empty");
			return null;
		}
		else{
			top = top.next;
			return top.data;
		}
	}
	String peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty, so no top Element");
			return null;
		}
		else{
			return top.data;
		}
	}
	void print(){
		Node temp = top;
		if(isEmpty()){
			System.out.println("stack is empty");
		}
		else{
			while(temp != null){
				System.out.print(temp.data+" ,");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
class main{
	public static void main (String []args){
		stack sL = new stack();
		sL.pop(); //a
		sL.peek(); //b
		sL.push("D1");
		sL.push("D2");
		sL.push("D3");
		sL.push("D4");
		sL.push("D5");
		sL.push("D6");
		sL.push("D7");
		sL.print(); //c
		sL.pop();
		sL.pop();//d
		System.out.println("Now peek is = "+sL.peek()); //e
		sL.print(); //f
	}
}