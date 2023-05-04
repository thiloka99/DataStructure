class stack{
	final int size = 5;
	int top = -1;
	int array[] = new int[size];
	
	boolean isEmpty(){
		return top<0;
	}
	boolean isFull(){
		return (top == size-1);
	}
	void push(int data){
		if(isFull()){
			System.out.println("Stack is full.");
		}
		else{
			array[++top] = data;
		}
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return array[top--];
		}
	}
	int peek(){
		if(isEmpty()){
			return 0;
		}
		else{
			return array[top];
		}
	}
	void print(){
		for(int i=top; i>=0; i--){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
}
class Main{ 
	public static void main(String []args){
		stack s1 = new stack();
		s1.pop();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.print();
		System.out.println("Peek is = "+s1.peek());
		s1.pop();
		s1.print();
		s1.push(102);
		s1.push(100);
		s1.push(50);
		s1.print();
	}
}